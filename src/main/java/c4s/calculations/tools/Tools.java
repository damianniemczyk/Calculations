package c4s.calculations.tools;

/**
 * 
 * @author Damian
 */
public class Tools {

    public static String isOK(long calculated, long answer) {
        String ret;
        if (calculated == answer) {
            ret = "OK";
        } else {
            ret = "WRONG";
        }
        return ret;
    }
    
    public static void printOut(String text) {
        System.out.println(text);
    }
}
