package javaBasics;
import java.util.*;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int  a = sc.nextInt();
        System.out.print("Input b: ");
        int  b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        sc.close();
    }
}
