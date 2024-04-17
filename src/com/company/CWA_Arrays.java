package com.company;

public class CWA_Arrays {
    public static void main(String[] args) {
//        int[] marks= new int [5];
//        marks[0]=23;
//        marks[1]=98;
//        marks[2]=21;
//        marks[3]=45;
//        marks[4]=96;

        int [] marks = {2,34,45,56,12};    //Preferred way to print an array
//        System.out.println(marks[1]);

               //In correct Order
        for(int i=0; i< marks.length;i++){
            System.out.println(marks[i]);
        }

                //In reverse Order
//        for(int i= marks.length-1;i>=0; i--){
//            System.out.println(marks[i]);
//        }
//
                //To print a string
//        String [] students ={"Avi","Rohan","Aashi","Jay"};
//        System.out.println(students[2]);
    }
}
