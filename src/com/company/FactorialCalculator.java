package com.company;

public class FactorialCalculator {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial for a different number
        long factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}
