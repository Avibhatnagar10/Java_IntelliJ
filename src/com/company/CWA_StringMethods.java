package com.company;

import java.sql.SQLOutput;

public class CWA_StringMethods {
    public static void main(String[] args) {
        String name= "Tanjiro";
//        System.out.println(name);

        /// These are some of the string methods given:
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();               //for LowerCasing
        System.out.println(lstring);

        String ustring = name.toUpperCase();               //for UpperCasing
        System.out.println(ustring);

        String nonTrimmingString = "    Nezuko   ";           //for trimming
        System.out.println(nonTrimmingString);
        String trimmedString = nonTrimmingString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2));       //Substring

        System.out.println(name.replace('A','T'));     //Replacing a Char

        System.out.println(name.charAt(2));  //returns char at given index position

        System.out.println(name.indexOf("j"));  //returns index of given string

        System.out.println(name.equals("inosuke"));
        System.out.println(name.equals("Tanjiro"));
        System.out.println(name.equalsIgnoreCase("TAnjiRo"));
    }
}
