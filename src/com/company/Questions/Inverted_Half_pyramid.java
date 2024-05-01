package com.Questions;

public class Inverted_Half_pyramid {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=i-1;j<n;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
