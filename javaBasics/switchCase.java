package javaBasics;
import java.util.*;
class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one of the following options:\na\nb\nc");
        String input = sc.next();
        char button = input.charAt(0);
        switch (button) {
            case 'a':
                System.out.println("Hello");
                break;
            case 'b':
                System.out.println("Namaste");
                break;
            case 'c':
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
