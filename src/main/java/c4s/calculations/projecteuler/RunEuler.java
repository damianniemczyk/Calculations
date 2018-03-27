package c4s.calculations.projecteuler;

/**
 *
 * @author Damian
 */
public class RunEuler {

    public void run() {
        Solutions sol = new Solutions();
        long retVal;
        long ansVal;

        retVal = sol.problem_001_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P001);
        System.out.println(retVal + " compare to " + ansVal + " result " + isOK(retVal, ansVal));

        retVal = sol.problem_001_VerStream();
        ansVal = AnswersEnum.get(AnswersEnum.P001);
        System.out.println(retVal + " compare to " + ansVal + " result " + isOK(retVal, ansVal));

        retVal = sol.problem_002_VerIterate();
        ansVal = AnswersEnum.get(AnswersEnum.P002);
        System.out.println(retVal + " compare to " + ansVal + " result " + isOK(retVal, ansVal));
    }

    private static String isOK(long calculated, long answer) {
        String ret;
        if (calculated == answer) {
            ret = "OK";
        } else {
            ret = "WRONG";
        }
        return ret;
    }
}
