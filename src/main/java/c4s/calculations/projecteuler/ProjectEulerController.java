package c4s.calculations.projecteuler;

import c4s.calculations.tools.Tools;

/**
 * 
 * @author Damian
 */
public class ProjectEulerController {

    public void run() {
        Solutions sol = new Solutions();
        long retVal;
        long ansVal;

        retVal = sol.problem_001_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P001);
        printOut(retVal, ansVal);

        retVal = sol.problem_001_VerStream();
        ansVal = AnswersEnum.get(AnswersEnum.P001);
        printOut(retVal, ansVal);

        retVal = sol.problem_002_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P002);
        printOut(retVal, ansVal);
    }
    
    private void printOut(long retVal, long ansVal) {
        System.out.println(retVal + " compare to " + ansVal + " result " + Tools.isOK(retVal, ansVal));
        System.out.printf("%d compare to %d result %s\n", retVal, ansVal, Tools.isOK(retVal, ansVal));
    }
}