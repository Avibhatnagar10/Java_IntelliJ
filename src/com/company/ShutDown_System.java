package com.company;
import java.io.IOException;
public class ShutDown_System {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("Shutdown -h ");
            System.out.println("System is shutting down ....");
        } catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
