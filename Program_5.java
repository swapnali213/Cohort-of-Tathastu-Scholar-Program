/*Write a Java program to calculate Permutation and Combination of 2 numbers */

import java.util.Scanner;

class permuationCombination {

     long factorial(int n) {
        int factSum = 1;
        for (int i = 1; i <= n; i++) {

            factSum *= i;
        }
        return factSum;

    }
}

public class Program_5 {
    public static void main(String[] args) {
        permuationCombination pc = new permuationCombination();
        long perSum = 0, combSum = 0;
        int n = 0, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();
        System.out.println("Enter r:");
        r = sc.nextInt();
        perSum = (pc.factorial(n)/ pc.factorial(n - r));
        combSum = (pc.factorial(n) / (pc.factorial(n - r) * pc.factorial(r)));
        System.out.println("Permutation is: "+perSum);
        System.out.println("Combination is: "+combSum);

    }

}
