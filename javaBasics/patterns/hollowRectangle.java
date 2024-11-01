package javaBasics.patterns;
import java.util.*;
public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width: ");
        int w= sc.nextInt();
        System.out.print("Input length: ");
        int l= sc.nextInt();
        sc.close();
        for(int i=1;i<=w;i++){
            for(int j=1;j<=l;j++){
                if((i==1||j==1 || i==w ||j==l)){
                    System.err.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
