package com.company;
import java.util.Scanner;

public class CWA_Greetings {
    public static void main(String[] args) {
        System.out.println("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+ name + " Have a Good Day ");
    }
}
