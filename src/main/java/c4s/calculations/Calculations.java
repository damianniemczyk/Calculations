package c4s.calculations;

import c4s.calculations.projecteuler.ProjectEulerController;

/**
 * 
 * @author Damian
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new ProjectEulerController().run();
        System.out.println(potega(5,3));
        System.out.println(silnia(5));
        //fizzBuzz();
        
        /*System.out.println(Problems.countBlocks(4));
        System.out.println(Problems.countElements(4));
        //DisplayElements(4); 
        System.out.println(Problems.countPrimeNumbers(2, 20));
        System.out.println(Problems.countPrimeNumbers2(2, 20));
        
        System.out.println(Problems.isPrime(31031, 2));
        System.out.println(Problems.isPrime(46656, 2));*/
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
    
    private static void fizzBuzz2(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz " + value);
        } else if (value % 3 == 0) {
            System.out.println("Fizz " + value);
        } else if (value % 5 == 0) {
            System.out.println("Buzz " + value);
        }
        if (value <= 1000) fizzBuzz2(value + 1);
    }
    
    private static int potega(int liczba, int potega) {
        if (potega == 1) return liczba;
        else return liczba * potega(liczba, potega -1);
    }
    
    private static int silnia(int liczba) {
        if (liczba == 1) return 1;
        else return liczba * silnia(liczba - 1);
    }

}

