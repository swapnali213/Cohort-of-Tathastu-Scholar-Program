/*Write a Java program to calculate a Factorial of a number */

import java.util.Scanner;

class factorial {
    long factSum = 1;

    public factorial(int n) {
        for (int i = 1; i <= n; i++) {

            factSum = factSum * i;
        }
        System.out.println("Factorial of " + n + " is " + factSum);
    }

}

public class Program_3 {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial");
        Scanner sc = new Scanner(System.in);
        factorial f = new factorial(sc.nextInt());

    }
}
