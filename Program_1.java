/*Write a Java program to perform basic Calculator operations*/ 

import java.util.Scanner;
import java.util.ArrayList;

class calculator {

    int add(int a, int b) {
        return a + b;

    }

    int sub(int a, int b) {
        return a - b;

    }

    long mul(int a, int b) {
        return a * b;

    }

    float div(int a, int b) {
        return a / b;

    }

    int mod(int a, int b) {
        return a % b;

    }

}

public class Program_1 {
    public static void main(String[] args) {
        int numOne = 0, numTwo = 0, total = 0;
        float divTotal;
        Scanner sc = new Scanner(System.in);
        calculator c = new calculator();
        System.out.println("Enter 2 numbers");
        numOne = sc.nextInt();
        numTwo = sc.nextInt();

        int choice = 0;
        do {
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multipication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 0 for exit");
            System.out.println("Enter your choice::");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    total = c.add(numOne, numTwo);
                    System.out.println("-----------------------------------------");
                    System.out.println("Addition is = " +total);
                    System.out.println("-----------------------------------------");
                    total = 0;
                    break;
                case 2:
                    total = c.sub(numOne, numTwo);
                    System.out.println("-----------------------------------------");
                    System.out.println("Subtraction is = " +total);
                    System.out.println("-----------------------------------------");
                    total = 0;
                    break;
                case 3:
                    long mulTotal = c.mul(numOne, numTwo);
                    System.out.println("-----------------------------------------");
                    System.out.println("Multipication is = " +mulTotal);
                    System.out.println("-----------------------------------------");
                    break;
                case 4:

                    divTotal = c.div(numOne, numTwo);
                    System.out.println("-----------------------------------------");
                    System.out.println("Division is = " +divTotal);
                    System.out.println("-----------------------------------------");
                    divTotal = 0;
                    break;
                case 5:
                    divTotal = c.mod(numOne, numTwo);
                    System.out.println("-----------------------------------------");
                    System.out.println("Modulus Division is = " +divTotal);
                    System.out.println("-----------------------------------------");
                    divTotal = 0;
                    break;
                 default:
                 System.out.println("!!!!!!!Please Enter correct choice");
                   

            }
        } while (choice != 0);

    }

}
