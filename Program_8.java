/*Write a Java Program to check whether the given array is Mirror Inverse or not */

import java.util.Scanner;

public class Program_8 {
    static boolean mirrorInverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        if (mirrorInverse(arr)) {
            System.out.println("Yes array is Mirror Inverse");
        } else {
            System.out.println("No array is  not Mirror Inverse");

        }

    }
}
