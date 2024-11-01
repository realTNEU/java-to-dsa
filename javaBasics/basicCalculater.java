package javaBasics;

import java.util.*;

class basicCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What operation do you want to perform ? (Input index only)");
        System.out.println("1) Add\n2)subtract\n3)Multiply\n4)Divide");
        int button = sc.nextInt();
        System.out.print("Input first number: ");
        double a = sc.nextDouble();
        System.out.print("Input first number: ");
        double b = sc.nextDouble();
        switch(button){
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b);
                break;
            case 2:
            System.out.printf("%.2f - %.2f = %.2f\n",a,b,a-b);
            break;
            case 3:
            System.out.printf("%.2f X %.2f = %.2f\n",a,b,a*b);
            break;
            case 4:
            System.out.printf("%.2f / %.2f = %.2f\n",a,b,a/b);
            break;
            default:
            System.out.println("Invalid button pressed!");

        }
        sc.close();
    }
}
