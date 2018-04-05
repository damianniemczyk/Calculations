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
        parseAndPrint("001", retVal, ansVal);

        retVal = sol.problem_001_VerStream();
        ansVal = AnswersEnum.get(AnswersEnum.P001);
        parseAndPrint("001", retVal, ansVal);

        retVal = sol.problem_002_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P002);
        parseAndPrint("002", retVal, ansVal);
        
        retVal = sol.problem_003_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P003);
        parseAndPrint("003", retVal, ansVal);
        
        retVal = sol.problem_004_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P004);
        parseAndPrint("004", retVal, ansVal);
        
        retVal = sol.problem_005_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P005);
        parseAndPrint("005", retVal, ansVal);
    }

    private void parseAndPrint(String text, long retVal, long ansVal) {
        String parsedVal
                = String.format("Problem %s: %d compare to %d result %s", text, retVal, ansVal, Tools.isOK(retVal, ansVal));
        Tools.printOut(parsedVal);

        /*parsedVal = 
                "Problem " + text + ": " + retVal + " compare to " + ansVal + " result " + Tools.isOK(retVal, ansVal);
        Tools.printOut(parsedVal);*/
    }
}
