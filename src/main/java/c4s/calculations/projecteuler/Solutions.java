package c4s.calculations.projecteuler;

import java.util.stream.IntStream;

/**
 * 
 * @author Damian
 */
public class Solutions {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
        The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
     * @return Calculation result
     */

    public long problem_001_VerIterate() {
        long ret = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ret += i;
            }
        }
        
        return ret;
    }

    public long problem_001_VerStream() {
        long ret = 0;

        ret = IntStream.range(1, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();

        return ret;
    }

    /**
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     * @return Calculation result
     */

    public long problem_002_VerIterate() {
        long ret = -1;

        ret = calculateFibonacci(2, 1, 2);
        
        return ret;
    }
    
    public long calculateFibonacci(long total, long val1, long val2) {
        long result = val1 + val2;
        if (result > 4000000) {
            return total;
        } else {
            if (result % 2 == 0) {
                total += result;
            }
            return calculateFibonacci(total, val2, result);    
        }
    }
    
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143.
     * @return Calculation result
     */
    public long problem_003_VerIterate() {
        long ret = -1;
        
        final long value = 600851475143L;
        
        /*ret = LongStream.range(1L, value - 1L)
                .filter(i -> value % i == 0)
                .max().getAsLong();*/
        
                
        /*final long value = 6008514L;
        
        for (long i = value - 1; i > 1; i--) {
            if (value % i == 0) {
                ret = i;
                break;
            }
        }*/
        return ret;
    }
    
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
     * @return Calculation result
     */
    public long problem_004_VerIterate() {
        long ret = -1;
        long calc = -1;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                calc = i * j;
                if (isPalindrome(calc) && calc > ret) {
                    ret = calc;
                }
            }
        }
        return ret;
    }

    public boolean isPalindrome(long value) {
        boolean ret = true;

        char[] tab = String.valueOf(value).toCharArray();
        for (int k = 0; k < tab.length; k++) {
            if (tab[k] != tab[tab.length - k - 1]) {
                ret = false;
            }
        }
        return ret;
    }
    
    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     * @return Calculation result
     */
    public long problem_005_VerIterate() {
        long ret = 20;
        boolean keepGoing = true;
        
        while(keepGoing) {
            keepGoing = false;
            for (int i = 1; i <= 20; i++) {
                if (ret % i != 0) {
                    ret = ret + 20;
                    keepGoing = true;
                    break;
                }
            }
        }         
        return ret;
    }
    
    public long problem_005_VerStream() {
        long ret = 20;
        boolean keepGoing = true;
        
        /*Stream.builder().
                .filter(i -> number % i == 0)
                .count();
        }*/
        return ret;
    }
}
