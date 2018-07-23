package c4s.calculations.mathematics.projecteuler;

/**
 * @author Damian
 */
public enum AnswersEnum {
    P001(233168), 
    P002(4613732), 
    P003(6857), 
    P004(906609), 
    P005(232792560),
    P006(25164150),
    P007(104743),
    P008(23514624000L),
    P009(31875000),
    P010(142913828922L),
    P011(70600674),
    P012(76576500),
    P013(5537376230L),
    P014(837799),
    P015(137846528820L);
    
    private final long answer;
    
    AnswersEnum(long answer) {
        this.answer = answer;
    }
    
    public static long get(AnswersEnum en) {
        return en.answer;
    }
}
