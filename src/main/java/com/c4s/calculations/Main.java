package com.c4s.calculations;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Damian
 */
@SpringBootApplication
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("abbbcddaeaab");
        System.out.println(removeDuplicates("abbbcddaeaab"));
        
        
        String phrase = "most trees are blue";
        String returnValue = "";
        returnValue = Arrays.stream(phrase.split(" "))
                .map((str) -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .collect(Collectors.joining(" "));
                //.map((str) -> Character.toUpperCase(str.charAt(0)) + str.substring(1) + " ")
                //.reduce(returnValue, String::concat);
        
        //list.stream().forEach(x -> Character.toUpperCase(x.charAt(0)));
        
        System.out.println(returnValue);
        
        System.out.println(removeDuplicates("sgsrgggsrt"));
        
        
        //SpringApplication.run(Main.class, args);
        
        /*new ProjectEulerController().run();
        System.out.println(potega(5,3));
        System.out.println(silnia(5));*/
               
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
    
    private static String removeDuplicates(String input) {
        char[] arr = input.toCharArray();
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    arr[j] = 0;
            }
        }
        return String.valueOf(arr);
    }
    

    public static int findIt(int[] a) {
        int odd = -100;
        for (int value : a) {
            int numberOfOccurences = 0;
            for (int i : a) {
                if (value == i) {
                    numberOfOccurences++;
                }
            }
            if (numberOfOccurences % 2 == 1) {
                odd = value;
                break;
            }
        }
        return odd;
    }
    

    public static void findTest() {
        System.out.println("5, " + findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println("-1, " + findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println("5, " + findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        System.out.println("10, " + findIt(new int[]{10}));
        System.out.println("10, " + findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        System.out.println("1, " + findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }
}
