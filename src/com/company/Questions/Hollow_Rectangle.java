package com.Questions;

public class Hollow_Rectangle {
 public static void main(String[] args) {
  int n=4;
  int m=5;
  //outerloop
  for(int i=1;i<=n;i++){
   //innerloop
   for(int j=1;j<=m;j++){
    if(i==1 || j==1 || i==n || j==n){
     System.out.print("*");
    }else{
     System.out.print(" ");
    }
   }
   System.out.println();
  }
 }
}
