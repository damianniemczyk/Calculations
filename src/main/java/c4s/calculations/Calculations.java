
package c4s.calculations;

import c4s.calculations.mathematics.Problems;
import c4s.calculations.projecteuler.AnswersEnum;
import c4s.calculations.projecteuler.Solutions;

/**
 * @author Damian
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        runProjectEuler_Solutions();
        
        //fizzBuzz();
        
        System.out.println(Problems.countBlocks(4));
        System.out.println(Problems.countElements(4));
        //DisplayElements(4); 
        System.out.println(Problems.countPrimeNumbers(2, 20));
        System.out.println(Problems.countPrimeNumbers2(2, 20));
        
        System.out.println(Problems.isPrime(31031, 2));
        System.out.println(Problems.isPrime(46656, 2));
    }
    
    public static void runProjectEuler_Solutions() {
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
    
    private static void fizzBuzz() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }

}

