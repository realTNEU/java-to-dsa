package javaBasics;
import java.util.*;
class ageChecker{
    public static void main(String[] args) {
        System.out.println("Age Verification");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your age: ");
        int ageInput = sc.nextInt();
        if(ageInput>=18){
            System.out.println("You are an adult");
        }else if(ageInput>=13){
            System.out.println("You are a teenager");

        }else{
            System.out.println("You are a child");
        }
        sc.close();

    }
}