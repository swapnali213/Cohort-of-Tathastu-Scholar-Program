/*Write a Java Program to find the Transpose of a given Matrix */

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {

        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of the matrix");
        row = sc.nextInt();
        column = sc.nextInt();
        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        System.out.println("Give matrix :: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix after transpose :: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[i][j] = 0;
                for (int k = 0; k < row; k++) {
                    b[i][j] = a[j][i];
                }
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

}
