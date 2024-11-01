package javaBasics;
import java.util.*;
class multiplicationTableWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:");
        int n = sc.nextInt();
        System.out.print("Multiply till: ");
        int t = sc.nextInt();
        int i =0;
        while(i<=t){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
            i++;
        }
        sc.close();
    }
}
