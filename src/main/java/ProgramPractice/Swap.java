package ProgramPractice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int temp;
        temp = x1;
        x1 = y1;
        y1 = temp;
        System.out.println("After the swaping");
        System.out.print(x1 + " " + y1);
    }
}
