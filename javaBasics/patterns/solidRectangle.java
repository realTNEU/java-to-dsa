// Print a rectangle of length l and width w
package javaBasics.patterns;
import java.util.*;
public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width: ");
        int w= sc.nextInt();
        System.out.print("Input length: ");
        int l= sc.nextInt();
        for(int i=0;i<w;i++){
            for(int j=0;j<l;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
