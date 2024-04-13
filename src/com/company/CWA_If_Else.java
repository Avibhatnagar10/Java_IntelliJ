package com.company;
import java.util.Scanner;

public class CWA_If_Else {
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you age: ");
        age = sc.nextInt();
        int num=age;
        if (age>=18) System.out.println("You are Eligible to drive! Less goo...");
        else
            System.out.println("You're not elegible to drive sorry!!!");



    }
}
