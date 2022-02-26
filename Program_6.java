/*Write a program in Java to print Diamond Pattern */

public class Program_6 {
    public static void main(String[] args) {

        int n = 20, i, j, space;

        for (i = 0; i < n; i++) {
            for (space = i; space < (n - 1); space++)
                System.out.print(" ");
            for (j = 0; j < (i * 2) + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for(i=0; i<(n-1); i++)
      {
         for(space=i; space>=0; space--)
            System.out.print(" ");
         for(j=(n*2)-3; j>(i*2); j--)
            System.out.print("*");
         System.out.print("\n");
      }

    }

}
