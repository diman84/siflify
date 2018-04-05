import jscip.*;

/** Example how to read an instance and solve it with the SCIP Java interface. */
public class Files
{
   public static void main(String args[])
   {
      // load generated C-library
      System.loadLibrary("jscip");

      SWIGTYPE_p_FILE file = SCIPJNI.openFile("/Users/admin/tmp/myfile.txt");
      SCIPJNI.closeFile(file);
    }
}