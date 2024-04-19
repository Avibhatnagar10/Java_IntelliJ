package com.company;
import java.util.Scanner;
public class Array_In_Reverse_Order {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element at index"+i+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reverse Order:");
        for(int i= arr.length-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
