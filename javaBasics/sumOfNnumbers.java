//Print sum of first n natural numbers
package javaBasics;

import java.util.*;

public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;;
        for(int i=1;i<=n;i++){
              sum = sum +i;
        }
        System.out.printf("The sum of first %d numbers is %d",n,sum);
        sc.close(); 
    }
}
