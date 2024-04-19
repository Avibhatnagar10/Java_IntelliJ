package com.company;

public class MaxElement_In_Array {
    public static void main(String[] args) {

        //To fin maximum element in an array
        int [] array= {10,22,34,18,56};
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum element in array is:"+max);


        //To find minimum element in an array
int min =array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Minimum element in array is:"+min);
    }
}
