package c4s.calculations;

import c4s.calculations.mathematics.Problems;
import c4s.calculations.projecteuler.RunEuler;

/**
 * @author Damian
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new RunEuler().run();
        
        //fizzBuzz();
        
        System.out.println(Problems.countBlocks(4));
        System.out.println(Problems.countElements(4));
        //DisplayElements(4); 
        System.out.println(Problems.countPrimeNumbers(2, 20));
        System.out.println(Problems.countPrimeNumbers2(2, 20));
        
        System.out.println(Problems.isPrime(31031, 2));
        System.out.println(Problems.isPrime(46656, 2));
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

