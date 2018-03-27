package c4s.calculations.projecteuler;

/**
 * @author Damian
 */
public enum AnswersEnum {
    P001(233168), 
    P002(4613732), 
    P003(0), 
    P004(0), 
    P005(0);
    
    private final long answer;
    
    AnswersEnum(long answer) {
        this.answer = answer;
    }
    
    public static long get(AnswersEnum en) {
        return en.answer;
    }
}
