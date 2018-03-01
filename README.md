 This project provides an interface from the Java programming language to the [SCIP](http://scip.zib.de) solver software.

How to build a model using JSCIPOpt
===================================

There are several examples provided in the `examples` folder. These display some functionality of the interface and can
serve as an entry point for writing more complex code. The following steps are always required when using the interface:

1) It is necessary to add

    `import jscip.*;`

to the beginning of your Java file. This imports all needed classes to use the interfaces.

2) Create a solver instance and initialize the internal C data structures with

    ```
    Scip scip = new SCIP();
    scip.create("Example");
    ```

This is the equivalent to calling `SCIPcreate(&scip)` and `SCIPcreateProbBasic(scip, "Example")` in C.

3) The most important classes are Scip.java, Variable.java, Constraint.java, and Solution.java. They represent the C
data structs `SCIP`, `SCIP_VAR`, `SCIP_CONS`,`SCIP_SOL` and provide some basic functionality. Using the Java classes
works similar to C , e.g.,

    ```
    Variable vars = new Variables[2];
    vars[0] = scip.createVar("x", 1.0, 2.0, -1.0, SCIP_Vartype.SCIP_VARTYPE_INTEGER);
    vars[1] = scip.createVar("y", 3.0, 4.0, -2.0, SCIP_Vartype.SCIP_VARTYPE_CONTINUOUS);

    double[] vals = {1.0, -3.6};
    Constraint lincons = scip.createConsLinear("lincons", vars, vals, -scip.infinity(), 10.0);
    scip.addCons(lincons);
    scip.releaseCons(lincons);

    scip.solve();
    scip.free();
    ```

which creates two variables, a linear constraint, adds it to SCIP, solves the problem and finally frees it.


How to extend the interface
===========================

The package already contains an interface to SCIP created with the Simplified Wrapper and Interface Generator
[SWIG](http://www.swig.org/). Extending the interface requires to install SWIG. The following steps are necessary to add
a new function to the interface:

1) Add the signature of an interface function to src/scipjni.i, e.g.,

    `SCIP_Real SCIPfeastol(SCIP* scip);`

2) Implement the function, depending on its signature, in `java/jscip/{Scip,Variable,Constraint,Solution}.java`, e.g.,

    ```
    public class Scip
    {
       private SWIGTYPE_p_SCIP _scipptr;

       ...

       public double feastol()
       {
          return SCIPJNI.SCIPfeastol(_scipptr);
       }
    }
    ```

3) Follow the steps in INSTALL.md to compile JSCIPOpt.

Note that each of the four mentioned classes hold their own C pointer in a class generated by SWIG. The object of this
class needs to be passed to the new implemented interface function.


After all previous steps it is now possible to call the function via
```
double ftol = scip.feastol();
```