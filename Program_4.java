/*Write a Java program to find out whether the given String is Palindrome or not */

import java.util.Scanner;

class palindrome {

    boolean compute(String s) {
        String revString = new StringBuffer(s).reverse().toString().toLowerCase();
        if (s.equalsm(revString)) {
            return true;

        } else {
            return false;
        }

    }
}

public class Program_4 {
    public static void main(String[] args) {

        palindrome p = new palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to palindrome check");

        if (p.compute(sc.nextLine().toLowerCase()) == true) {
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }

    }

}
