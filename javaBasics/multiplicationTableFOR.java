package javaBasics;
import java.util.*;
class multiplicationTableFOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:");
        int n = sc.nextInt();
        System.out.print("Multiply till: ");
        int t = sc.nextInt();
        for(int i = 1; i<=t;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
        sc.close();
    }
}
