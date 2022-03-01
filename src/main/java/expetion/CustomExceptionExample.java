package expetion;

import java.util.Scanner;

public class CustomExceptionExample {
    public static void main(String[] args) {
        System.out.println("==============Enter the your age===========");
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if (age > 60) {
            throw new TooOldException("Your age is too old to get marry");
        } else if (age < 18) {
            throw new TooYoungException("You are too young, wait some time");
        } else {
            System.out.println("You will get match over mail in soon");
        }
    }
}
