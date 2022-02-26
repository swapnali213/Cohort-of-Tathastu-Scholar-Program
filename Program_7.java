/*Write a Java Program to reverse the letters present in the given String */

import java.util.Scanner;
public class Program_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String originalString=sc.nextLine();
        String reverseString=new StringBuffer(originalString).reverse().toString();
        System.out.println("-----------------------------------------");
        System.out.println("Original String="+originalString);
        System.out.println("Reverse String="+reverseString);
        System.out.println("-----------------------------------------");


    }
    
}
