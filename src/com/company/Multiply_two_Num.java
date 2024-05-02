package com.company;

import java.util.Scanner;

public class Multiply_two_Num  {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input validation
        System.out.println("Enter first number:");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer:");
            sc.next(); // Consume the invalid input
        }
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer:");
            sc.next(); // Consume the invalid input
        }
        int b = sc.nextInt();

        int result = calculateProduct(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
