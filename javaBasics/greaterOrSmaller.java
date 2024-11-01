package javaBasics;
import java.util.*;
class greaterOrSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println(a+" and "+b+" are equal");
        }
        sc.close();
    }
}
