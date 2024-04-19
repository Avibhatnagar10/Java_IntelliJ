package com.company;

public class CWA_MultiDimentional_Array {
    public static void main(String[] args) {
//        String [] [] car =  {{"BMW","Audi","Porsche","Bentley"},{"2001","102","2004","1990"}};
//        for (int i = 0; i < car.length; i++) {
//            // Loop through each column
//            for (int j = 0; j < car[i].length; j++) {
//                System.out.print(car[i][j] + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }

        int [] [] flats ={{101,102,103},{201,202,203}};
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
        System.out.println("");
        }
        System.out.println("Here are the Flats shown above");
    }
}
