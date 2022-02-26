/*Write a Java program to remove elements from an ArrayList */

import java.util.Scanner;
import java.util.ArrayList;

public class Program_9 {
    static ArrayList<Integer> elements = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);

    static void operation(int num) {
        int addElement;

        for (int i = 0; i < num; i++) {
            addElement = sc.nextInt();
            elements.add(addElement);

        }

    }

    static void removeElement(int ele) {
        elements.remove(ele);
    }

    public static void main(String[] args) {
        int choice, index = 0;
        System.out.println("Enter number of elements you want to enter");
        int num = sc.nextInt();
        operation(num);
        do {
            System.out.println("Enter 1 for remove elements");
            System.out.println("Enter 0 for exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter index of elements you want to remove");
                    removeElement(sc.nextInt());
                    System.out.println("List after removing element ");
                    System.out.println("-----------------------------------------");
                    for (int i : elements) {
                        System.out.println("Index[" + index + "]----->" + i);
                        index++;

                    }
                    System.out.println("-----------------------------------------");
                    index = 0;

                    break;
            }

        } while (choice != 0);

    }

}
