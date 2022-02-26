/*Write a Java program to calculate Fibonacci Series up to n numbers*/

import java.util.Scanner;

class fibonacci {
    int store = 0, prevNumber = 0, nextNumber = 1;

    public fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(prevNumber + ", ");
            store = prevNumber + nextNumber;
            prevNumber = nextNumber;
            nextNumber = store;

        }

    }
}

public class Program_2 {
    public static void main(String[] args) {
        System.out.println("Enter number for fibonacci");
        Scanner sc = new Scanner(System.in);
        fibonacci f = new fibonacci(sc.nextInt());

    }
}
