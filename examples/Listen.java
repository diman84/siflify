import jscip.*;
import java.util.List;
import java.util.Arrays;
import java.util.Map.Entry;
import java.lang.Object;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteQueueRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.*;
import java.nio.file.*;
import org.apache.commons.lang3.*;
import org.json.*;

public class Listen
{
   public static void main(String args[])
   {

    AmazonSQS sqs = AmazonSQSClientBuilder.standard()
                                .withRegion(Regions.US_EAST_2)
                                .build();

      String file = "";
      String queueUrl = "https://sqs.us-east-2.amazonaws.com/638479812646/siflify";
      
      List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

      for (Message message : messages) {
            System.out.println("  Message");
            System.out.println("    MessageId:     " + message.getMessageId());
            System.out.println("    ReceiptHandle: " + message.getReceiptHandle());
            System.out.println("    MD5OfBody:     " + message.getMD5OfBody());
            System.out.println("    Body:          " + message.getBody());            
            for (Entry<String, String> entry : message.getAttributes().entrySet()) {
                System.out.println("  Attribute");
                System.out.println("    Name:  " + entry.getKey());
                System.out.println("    Value: " + entry.getValue());

                
            }   
            
        JSONObject obj = new JSONObject(message.getBody());
        if (obj.has("Records")) {
            JSONObject s3 = obj.getJSONArray("Records").getJSONObject(0).getJSONObject("s3");

            if (s3 != null) {
                System.out.println("S3 details");
                System.out.println("    Bucket:     " + s3.getJSONObject("bucket").getString("name"));
                System.out.println("    Object: " + s3.getJSONObject("object").getString("key"));

                file = getFile(s3.getJSONObject("bucket").getString("name"), s3.getJSONObject("object").getString("key")); 
                System.out.println("File location: " + file);
            }
        }

        sqs.deleteMessage(queueUrl, message.getReceiptHandle());
      }

      if (file.isEmpty() && args.length > 0) {
          file = args[0];
          System.out.println("read from command line: " + file);
      }

      if (!file.isEmpty()) {
        Scip scip = new Scip();
        
      // load generated C-library
       System.loadLibrary("jscip");

      // set up data structures of SCIP
        scip.create(file);

        // read problem
        scip.readProb(file);

        // solve problem
        scip.solve();

        // print statistics and the best found solution (only non-zeros)
        //scip.printStatistics();
        //scip.printBestSol(false);           
        
        Solution sol = scip.getBestSol();
        //if( sol != null )
        //{
            try { 
                
                //scip.writeBestSol("/Users/admin/tmp/best_sol.sol", false);   

            //Variable[] vars = scip.getVars();
            //Double solObj = scip.getSolOrigObj(sol);
            //String fileName  = file.substring(0, file.indexOf('.')) + ".sol";
            String fileName  = (new File(file)).getName();
            fileName = fileName.substring(0, fileName.indexOf('.')) + ".sol";
            
            scip.writeBestSol(fileName, false);   

            // FileWriter fw = new FileWriter(fileName);
            // String objTitle = "objective value:";
            // writeCol1(fw, objTitle, solObj.toString());

            // for (int i = 0; i < vars.length; i++) {
            //     fw.write("\n");
            //     writeCol1(fw, vars[i].getName(), ((Double)scip.getSolVal(sol, vars[i])).toString());
            //     fw.write(" \t(obj:" + vars[i].getObj() + ")");
            //     //fw.write("\nvariable " + vars[i].getName() + ": " + vars[i].getObj());
            // }
        
            // fw.close();


            writeFile(fileName);

            }
            catch (AmazonServiceException e) {
                System.err.println(e.getErrorMessage());
                System.exit(1);
            }
        //}
        // free SCIP
        scip.free();
      }
    }

    static final int COL1 = 53;

    private static void writeCol1(FileWriter fw, String key, String val) throws IOException {
        fw.write(key + StringUtils.leftPad(val, COL1 - key.length()));
    }

    private static void writeFile(String path) {
        try {
            File file = new File(path);                  
            file.deleteOnExit();

            final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
                                        .withRegion(Regions.US_EAST_2)
                                        .build();
            System.out.println("Writing file to S3: " + file.getName());
            s3.putObject(new PutObjectRequest(
                "scipsolutions", file.getName(), file));
        }
        catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        }
    }

    private static String getFile(String bucket_name, String key_name) {
        
        String filePath = key_name;
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
                                    .withRegion(Regions.US_EAST_2)
                                    .build();
        try {
            S3Object o = s3.getObject(bucket_name, key_name);
            S3ObjectInputStream s3is = o.getObjectContent();
            File file = new File(key_name);
            FileOutputStream fos = new FileOutputStream(file);
            byte[] read_buf = new byte[1024];
            int read_len = 0;
            while ((read_len = s3is.read(read_buf)) > 0) {
                fos.write(read_buf, 0, read_len);
            }
            s3is.close();
            fos.close();
            return file.getAbsolutePath();
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        return filePath;
        
    }
}
