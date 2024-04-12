package com.company;
import java.util.Scanner;
import java.util.Scanner;
public class CWA_PercentageCalc {
    public static void main(String[] args) {
        System.out.println("Enter The Marks of following Subjects");
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks in English:");
        int eng= sc.nextInt();
        System.out.println("Marks in Hindi:");
        int hin= sc.nextInt();
        System.out.println("Marks in Science: ");
        int sci= sc.nextInt();
        System.out.println("Marks in Math: ");
        int math= sc.nextInt();
        System.out.println("Marks in Social Science: ");
        int soc= sc.nextInt();

        int sum= eng+hin+sci+math+soc;
        double percentage= (sum/5.0) * 100;
        System.out.println("percentage: " +percentage);

    }
}
