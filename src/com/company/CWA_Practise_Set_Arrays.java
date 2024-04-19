package com.company;

public class CWA_Practise_Set_Arrays {
    public static void main(String[] args) {

        //Problem-1
//    float[] marks= {1.3f,4.5f,45.2f,47.8f,100.2f};
//    float sum=0;
//    for(float element:marks){
//        sum=sum+element;
//    }
//        System.out.println("The value of sum:"+sum);

       //Problem-2   To check whether element is present in given array or not
//        int [] marks ={2,3,5,6};
//        int num=3;
//        boolean IsinArray=false;
//        for(int elements: marks){
//            if(num==elements){
//                 IsinArray=true;
//                break;
//            }
//        }
//        if(IsinArray){
//            System.out.println("Present");
//        }
//        else {
//            System.out.println("Not present");
//        }


        //Problem 3  to calculate the avg sum of scores
//        int [] score= {23,87,56,34,12};
//        int sum=0;
//        for(int elements:score){
//            sum= sum+elements;
//        }
//        System.out.println("The value of avg Score is:" + sum/ score.length);


        //Problem 4  to add two matrices of  size 2 x 3
//        int [] [] mat1= {
//                {1,2,4,6},
//                {3,5,7,9}
//        };
//        int [] [] mat2={
//                {12,9,13,54},
//                {43,21,19,10}
//        };
//        int [] [] result= new int [2][4];
//
//        for( int i=0;i< mat1.length;i++){
//                for(int j=0;j<mat1[i].length;j++){
//                    result[i][j]=mat1[i][j] + mat2[i][j];
//                    System.out.print(result[i][j]+" ");
//                }
//            System.out.println("");
//        }

        //Problem 5 Program to reverse an array
//        int [] score={23,45,11,78};
//        for(int i= score.length-1;i>=0;i--)
//        System.out.print(score[i]+" ");

        //Problem 8 whether given array is sorted or not
        boolean isSorted =true;
        int [] num={10,21,1,3,43,9,56};
        for(int i=0;i<num.length;i++){
            if(num[i]>num[i+1]){
                isSorted=false;
                break;
            }
                System.out.println("Array is not sorted");
        }

    }
}
