package com.company;
class employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My is id:" +id);
        System.out.println("And my name is :" +name);
    }
    public int getSalary(){
return getSalary();
    }
}


public class CWA_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee Avi = new employee(); //Instantiating a new employee object
        employee Shanaya = new employee(); //Instantiating a new employee object

        //Setting attributes for Avi
        Avi.id=12;
        Avi.salary=1200000;
        Avi.name="Coder Avi";

        //Setting attributes for Shanaya
         Shanaya.id=13;
         Shanaya.salary=800000;
         Shanaya.name="Pilot Shanaya";

        //Printing attributes
       Avi.printDetails();
       Shanaya.printDetails();

    }
}
