package javaBasics;
import java.util.*;
import java.lang.Math;
public class primeNumber {  
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        double sqrN = Math.sqrt(n);
        int x = (int) sqrN;
        sc.close();
        if (n < 2) {
            System.out.printf("%d is not a prime number", n);
        } else if (n == 2 || n == 3) {
            System.out.printf("%d is a prime number", n);
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= x; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d is a prime number", n);
            } else {
                System.out.printf("%d is not a prime number", n);
            }
        }
    }
}
