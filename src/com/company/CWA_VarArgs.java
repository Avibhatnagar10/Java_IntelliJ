package com.company;

public class CWA_VarArgs {
   static int sum(int x, int...arr) {
int result =x;
for(int a:arr){
    result += a;
}
return result;
   }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
//        System.out.println("The sum of Nothing is: "+ sum());
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 4 and 4 and 2 is: "+ sum(4,4,2));
        System.out.println("The sum of 4 and 7 and 9is: "+ sum(4,7,9));
    }
}

