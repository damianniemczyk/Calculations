package c4s.calculations.mathematics;

/**
 * 
 * @author Damian
 */
public class Problems {
     
    public static int countPrimeNumbers(int left, int right) {
        int counter = 0;
        for (int num = left; num <= right; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num != i && num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
                System.out.println(num);
            }
        }
        return counter;
    }
    
    public static int countPrimeNumbers2(int left, int right) {
        int counter = 0;
        for (int num = left; num <= right; num++) {
            if (isPrime(num, 2) == 1) {
                counter++;
                System.out.println(num);
            }
        }
        return counter;
    }
 
    public static int isPrime(int num, int i) {
        if (num == i) return 1;
        if (num != i && num % i == 0) {
            return -1;
        } else if (num > i) {
            i++;
            return isPrime(num, i);
        } else {
            return 1;
        }
    }
    
    //Pyramid
    public static int countBlocks(int baseSize) {
        int counter = 0;
        for (int n = baseSize; n > 0; n = n - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countElements(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number * number + countElements((number - 1));
        }
    }
    
    //not finished
    public static void displayElements(int number) {
        int i = 1;
        int col = 1;
        int row = 1;
        int level = 1;

        while (true) {
            System.out.println("B " + i + ", R - " + row + ", C - " + col + ", L - " + level);
            if (col < number) {
                col++;
                i++;
            }
            if (col == number) {
                col = 0;
                row++;
                i++;
            }
            if (row == number) {
                row = 1;
                col = 1;
                level++;
                i++;
            }
            if (level == number) {
                System.out.println("B " + i + ", R - " + row + ", C - " + col + ", L - " + level);
                break;
            }
        }
    }
}
