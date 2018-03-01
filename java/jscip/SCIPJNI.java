/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jscip;

public class SCIPJNI {
  public static SWIGTYPE_p_double new_double_array(int nelements) {
    long cPtr = SCIPJNIJNI.new_double_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void delete_double_array(SWIGTYPE_p_double ary) {
    SCIPJNIJNI.delete_double_array(SWIGTYPE_p_double.getCPtr(ary));
  }

  public static double double_array_getitem(SWIGTYPE_p_double ary, int index) {
    return SCIPJNIJNI.double_array_getitem(SWIGTYPE_p_double.getCPtr(ary), index);
  }

  public static void double_array_setitem(SWIGTYPE_p_double ary, int index, double value) {
    SCIPJNIJNI.double_array_setitem(SWIGTYPE_p_double.getCPtr(ary), index, value);
  }

  public static SWIGTYPE_p_p_SCIP_VAR new_SCIP_VAR_array(int nelements) {
    long cPtr = SCIPJNIJNI.new_SCIP_VAR_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SCIP_VAR(cPtr, false);
  }

  public static void delete_SCIP_VAR_array(SWIGTYPE_p_p_SCIP_VAR ary) {
    SCIPJNIJNI.delete_SCIP_VAR_array(SWIGTYPE_p_p_SCIP_VAR.getCPtr(ary));
  }

  public static SWIGTYPE_p_SCIP_VAR SCIP_VAR_array_getitem(SWIGTYPE_p_p_SCIP_VAR ary, int index) {
    long cPtr = SCIPJNIJNI.SCIP_VAR_array_getitem(SWIGTYPE_p_p_SCIP_VAR.getCPtr(ary), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_VAR(cPtr, false);
  }

  public static void SCIP_VAR_array_setitem(SWIGTYPE_p_p_SCIP_VAR ary, int index, SWIGTYPE_p_SCIP_VAR value) {
    SCIPJNIJNI.SCIP_VAR_array_setitem(SWIGTYPE_p_p_SCIP_VAR.getCPtr(ary), index, SWIGTYPE_p_SCIP_VAR.getCPtr(value));
  }

  public static SWIGTYPE_p_p_SCIP_SOL new_SCIP_SOL_array(int nelements) {
    long cPtr = SCIPJNIJNI.new_SCIP_SOL_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SCIP_SOL(cPtr, false);
  }

  public static void delete_SCIP_SOL_array(SWIGTYPE_p_p_SCIP_SOL ary) {
    SCIPJNIJNI.delete_SCIP_SOL_array(SWIGTYPE_p_p_SCIP_SOL.getCPtr(ary));
  }

  public static SWIGTYPE_p_SCIP_SOL SCIP_SOL_array_getitem(SWIGTYPE_p_p_SCIP_SOL ary, int index) {
    long cPtr = SCIPJNIJNI.SCIP_SOL_array_getitem(SWIGTYPE_p_p_SCIP_SOL.getCPtr(ary), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_SOL(cPtr, false);
  }

  public static void SCIP_SOL_array_setitem(SWIGTYPE_p_p_SCIP_SOL ary, int index, SWIGTYPE_p_SCIP_SOL value) {
    SCIPJNIJNI.SCIP_SOL_array_setitem(SWIGTYPE_p_p_SCIP_SOL.getCPtr(ary), index, SWIGTYPE_p_SCIP_SOL.getCPtr(value));
  }

  public static double SCIPcalcMachineEpsilon() {
    return SCIPJNIJNI.SCIPcalcMachineEpsilon();
  }

  public static SCIP_Retcode SCIPcreate(SWIGTYPE_p_p_SCIP scip) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPcreate(SWIGTYPE_p_p_SCIP.getCPtr(scip)));
  }

  public static int SCIPgetNVars(SWIGTYPE_p_SCIP scip) {
    return SCIPJNIJNI.SCIPgetNVars(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static SCIP_Retcode SCIPreadProb(SWIGTYPE_p_SCIP scip, String filename, String extension) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPreadProb(SWIGTYPE_p_SCIP.getCPtr(scip), filename, extension));
  }

  public static SCIP_Retcode SCIPreadParams(SWIGTYPE_p_SCIP scip, String filename) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPreadParams(SWIGTYPE_p_SCIP.getCPtr(scip), filename));
  }

  public static SCIP_Retcode SCIPcreateProbBasic(SWIGTYPE_p_SCIP scip, String probname) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPcreateProbBasic(SWIGTYPE_p_SCIP.getCPtr(scip), probname));
  }

  public static SCIP_Retcode SCIPincludeDefaultPlugins(SWIGTYPE_p_SCIP scip) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPincludeDefaultPlugins(SWIGTYPE_p_SCIP.getCPtr(scip)));
  }

  public static SCIP_Retcode SCIPsolve(SWIGTYPE_p_SCIP scip) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsolve(SWIGTYPE_p_SCIP.getCPtr(scip)));
  }

  public static SCIP_Retcode SCIPaddVar(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_VAR var) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPaddVar(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_VAR.getCPtr(var)));
  }

  public static SWIGTYPE_p_p_SCIP_VAR SCIPgetVars(SWIGTYPE_p_SCIP scip) {
    long cPtr = SCIPJNIJNI.SCIPgetVars(SWIGTYPE_p_SCIP.getCPtr(scip));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SCIP_VAR(cPtr, false);
  }

  public static SCIP_Retcode SCIPaddCons(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_CONS cons) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPaddCons(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_CONS.getCPtr(cons)));
  }

  public static SCIP_Retcode SCIPwriteOrigProblem(SWIGTYPE_p_SCIP scip, String filename, String extension, long genericnames) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPwriteOrigProblem(SWIGTYPE_p_SCIP.getCPtr(scip), filename, extension, genericnames));
  }

  public static SCIP_Retcode SCIPwriteTransProblem(SWIGTYPE_p_SCIP scip, String filename, String extension, long genericnames) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPwriteTransProblem(SWIGTYPE_p_SCIP.getCPtr(scip), filename, extension, genericnames));
  }

  public static SCIP_Retcode SCIPprintStatistics(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_FILE file) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPprintStatistics(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_FILE.getCPtr(file)));
  }

  public static SCIP_Retcode SCIPprintBestSol(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_FILE file, long printzeros) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPprintBestSol(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_FILE.getCPtr(file), printzeros));
  }

  public static void SCIPsetMessagehdlrQuiet(SWIGTYPE_p_SCIP scip, long quite) {
    SCIPJNIJNI.SCIPsetMessagehdlrQuiet(SWIGTYPE_p_SCIP.getCPtr(scip), quite);
  }

  public static SWIGTYPE_p_p_SCIP_SOL SCIPgetSols(SWIGTYPE_p_SCIP scip) {
    long cPtr = SCIPJNIJNI.SCIPgetSols(SWIGTYPE_p_SCIP.getCPtr(scip));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SCIP_SOL(cPtr, false);
  }

  public static int SCIPgetNSols(SWIGTYPE_p_SCIP scip) {
    return SCIPJNIJNI.SCIPgetNSols(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static SWIGTYPE_p_SCIP_SOL SCIPgetBestSol(SWIGTYPE_p_SCIP scip) {
    long cPtr = SCIPJNIJNI.SCIPgetBestSol(SWIGTYPE_p_SCIP.getCPtr(scip));
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_SOL(cPtr, false);
  }

  public static double SCIPgetSolVal(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_SOL sol, SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPgetSolVal(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_SOL.getCPtr(sol), SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static double SCIPgetSolOrigObj(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_SOL sol) {
    return SCIPJNIJNI.SCIPgetSolOrigObj(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_SOL.getCPtr(sol));
  }

  public static double SCIPinfinity(SWIGTYPE_p_SCIP scip) {
    return SCIPJNIJNI.SCIPinfinity(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static double SCIPepsilon(SWIGTYPE_p_SCIP scip) {
    return SCIPJNIJNI.SCIPepsilon(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static double SCIPfeastol(SWIGTYPE_p_SCIP scip) {
    return SCIPJNIJNI.SCIPfeastol(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static SCIP_Retcode SCIPsetBoolParam(SWIGTYPE_p_SCIP scip, String name, long value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetBoolParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetIntParam(SWIGTYPE_p_SCIP scip, String name, int value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetIntParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetLongintParam(SWIGTYPE_p_SCIP scip, String name, int value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetLongintParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetRealParam(SWIGTYPE_p_SCIP scip, String name, double value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetRealParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetCharParam(SWIGTYPE_p_SCIP scip, String name, char value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetCharParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetStringParam(SWIGTYPE_p_SCIP scip, String name, String value) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetStringParam(SWIGTYPE_p_SCIP.getCPtr(scip), name, value));
  }

  public static SCIP_Retcode SCIPsetEmphasis(SWIGTYPE_p_SCIP scip, SCIP_ParamEmphasis paramemphasis, long quiet) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetEmphasis(SWIGTYPE_p_SCIP.getCPtr(scip), paramemphasis.swigValue(), quiet));
  }

  public static SCIP_Retcode SCIPsetObjsense(SWIGTYPE_p_SCIP scip, SCIP_Objsense objsense) {
    return SCIP_Retcode.swigToEnum(SCIPJNIJNI.SCIPsetObjsense(SWIGTYPE_p_SCIP.getCPtr(scip), objsense.swigValue()));
  }

  public static SCIP_Objsense SCIPgetObjsense(SWIGTYPE_p_SCIP scip) {
    return SCIP_Objsense.swigToEnum(SCIPJNIJNI.SCIPgetObjsense(SWIGTYPE_p_SCIP.getCPtr(scip)));
  }

  public static void BMScheckEmptyMemory() {
    SCIPJNIJNI.BMScheckEmptyMemory();
  }

  public static long BMSgetMemoryUsed() {
    return SCIPJNIJNI.BMSgetMemoryUsed();
  }

  public static String SCIPvarGetName(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetName(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static SCIP_Vartype SCIPvarGetType(SWIGTYPE_p_SCIP_VAR var) {
    return SCIP_Vartype.swigToEnum(SCIPJNIJNI.SCIPvarGetType(SWIGTYPE_p_SCIP_VAR.getCPtr(var)));
  }

  public static double SCIPvarGetLbLocal(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetLbLocal(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static double SCIPvarGetUbLocal(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetUbLocal(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static double SCIPvarGetLbGlobal(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetLbGlobal(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static double SCIPvarGetUbGlobal(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetUbGlobal(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static double SCIPvarGetObj(SWIGTYPE_p_SCIP_VAR var) {
    return SCIPJNIJNI.SCIPvarGetObj(SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static int SCIPsolGetDepth(SWIGTYPE_p_SCIP_SOL sol) {
    return SCIPJNIJNI.SCIPsolGetDepth(SWIGTYPE_p_SCIP_SOL.getCPtr(sol));
  }

  public static int SCIPsolGetIndex(SWIGTYPE_p_SCIP_SOL sol) {
    return SCIPJNIJNI.SCIPsolGetIndex(SWIGTYPE_p_SCIP_SOL.getCPtr(sol));
  }

  public static String SCIPconsGetName(SWIGTYPE_p_SCIP_CONS cons) {
    return SCIPJNIJNI.SCIPconsGetName(SWIGTYPE_p_SCIP_CONS.getCPtr(cons));
  }

  public static SWIGTYPE_p_SCIP createSCIP() {
    long cPtr = SCIPJNIJNI.createSCIP();
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP(cPtr, false);
  }

  public static void freeSCIP(SWIGTYPE_p_SCIP scip) {
    SCIPJNIJNI.freeSCIP(SWIGTYPE_p_SCIP.getCPtr(scip));
  }

  public static SWIGTYPE_p_SCIP_VAR createVar(SWIGTYPE_p_SCIP scip, String name, double lb, double ub, double obj, SCIP_Vartype vartype) {
    long cPtr = SCIPJNIJNI.createVar(SWIGTYPE_p_SCIP.getCPtr(scip), name, lb, ub, obj, vartype.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_VAR(cPtr, false);
  }

  public static void releaseVar(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_VAR var) {
    SCIPJNIJNI.releaseVar(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_VAR.getCPtr(var));
  }

  public static SWIGTYPE_p_SCIP_CONS createConsBasicLinear(SWIGTYPE_p_SCIP scip, String name, int nvars, SWIGTYPE_p_p_SCIP_VAR vars, SWIGTYPE_p_double vals, double lhs, double rhs) {
    long cPtr = SCIPJNIJNI.createConsBasicLinear(SWIGTYPE_p_SCIP.getCPtr(scip), name, nvars, SWIGTYPE_p_p_SCIP_VAR.getCPtr(vars), SWIGTYPE_p_double.getCPtr(vals), lhs, rhs);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_CONS(cPtr, false);
  }

  public static SWIGTYPE_p_SCIP_CONS createConsBasicQuadratic(SWIGTYPE_p_SCIP scip, String name, int nlinvars, SWIGTYPE_p_p_SCIP_VAR linvars, SWIGTYPE_p_double lincoefs, int nquadvars, SWIGTYPE_p_p_SCIP_VAR quadvars1, SWIGTYPE_p_p_SCIP_VAR quadvars2, SWIGTYPE_p_double quadcoefs, double lhs, double rhs) {
    long cPtr = SCIPJNIJNI.createConsBasicQuadratic(SWIGTYPE_p_SCIP.getCPtr(scip), name, nlinvars, SWIGTYPE_p_p_SCIP_VAR.getCPtr(linvars), SWIGTYPE_p_double.getCPtr(lincoefs), nquadvars, SWIGTYPE_p_p_SCIP_VAR.getCPtr(quadvars1), SWIGTYPE_p_p_SCIP_VAR.getCPtr(quadvars2), SWIGTYPE_p_double.getCPtr(quadcoefs), lhs, rhs);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_CONS(cPtr, false);
  }

  public static SWIGTYPE_p_SCIP_CONS createConsBasicSuperIndicator(SWIGTYPE_p_SCIP scip, String name, SWIGTYPE_p_SCIP_VAR binvar, SWIGTYPE_p_SCIP_CONS slackcons) {
    long cPtr = SCIPJNIJNI.createConsBasicSuperIndicator(SWIGTYPE_p_SCIP.getCPtr(scip), name, SWIGTYPE_p_SCIP_VAR.getCPtr(binvar), SWIGTYPE_p_SCIP_CONS.getCPtr(slackcons));
    return (cPtr == 0) ? null : new SWIGTYPE_p_SCIP_CONS(cPtr, false);
  }

  public static void releaseCons(SWIGTYPE_p_SCIP scip, SWIGTYPE_p_SCIP_CONS cons) {
    SCIPJNIJNI.releaseCons(SWIGTYPE_p_SCIP.getCPtr(scip), SWIGTYPE_p_SCIP_CONS.getCPtr(cons));
  }

}
