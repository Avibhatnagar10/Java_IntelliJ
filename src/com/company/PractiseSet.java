package com.company;
import java.util.Scanner;
public class PractiseSet {
    public static void main(String[] args) {

//    String name = "Takagi-san";
//        System.out.println(name.toLowerCase());
//
//        System.out.println(name.replace('-','_'));
//
//        String letter = "Dear <|name|>, Thanks a lot";
//        letter = letter.replace("<|name>|","Avi");
//        System.out.println(letter);

        int age;
        System.out.println("Enter your Age buddy:");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You're an Adult");
                break;
            case 21:
                System.out.println("You should apply for a job");
                break;
            case 25:
                System.out.println("You should get marry");
                break;
            default:
                System.out.println("Enjoy your life!!");
        }

//        if (age>56){
//            System.out.println("You're Experienced");
//        }
//        else if (age>46){
//            System.out.println("You are semi experienced");
//        }
//        else{
//            System.out.println("You need experience");
//        }

    }

}
