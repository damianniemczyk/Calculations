package c4s.calculations.projecteuler;

/**
 * @author Damian
 */
public enum AnswersEnum {
    P001(233168), 
    P002(4613732), 
    P003(6857), 
    P004(906609), 
    P005(232792560);
    
    private final long answer;
    
    AnswersEnum(long answer) {
        this.answer = answer;
    }
    
    public static long get(AnswersEnum en) {
        return en.answer;
    }
}
