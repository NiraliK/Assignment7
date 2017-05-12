/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A7Q8 {

    // method was created to determine the season depending on the date
    private static String season(int month, int day) {
        //date is stored as a string
        String date = "";
        //if loop created to determine what season is suppose to output
        //if it less than or equall to 03/15 then its winter
        if (month <= 3 && day <= 15) {
            date = "Winter";
            //if it is less than or equal to 03/16 its Spring 
        } else if (month <= 3 && day <= 16) {
            date = "Spring";
            //if it is less than or equal to 06/15 its Spring 
        } else if (month <= 6 && day <= 15) {
            date = "Spring";
            //if it is less than or equal to 06/16 it is Summer 
        } else if (month <= 6 && day <= 16) {
            date = "Summer";
            // if it is less than or equal to 09/15 its Summer 
        } else if (month <= 9 && day <= 15) {
            date = "Summer";
            //if it is less than or equal to 09/16 it is Fall
        } else if (month <= 9 && day <= 16) {
            date = "Fall";
            //if it is less than or equal to 12/15 it is Fall 
        } else if (month <= 12 && day <= 15) {
            date = "Fall";
            //if it is less than or equal to 12/16 it is Winter
        } else if (month <= 12 && day <= 16) {
            date = "Winter";
        }
        //return the date
        return date;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner created 
        Scanner input = new Scanner(System.in);
        //ask user to enter in the date, first month then day 
        System.out.println("Please enter in the date (month, day):");
        //store month as an int and input into next int
        int month = input.nextInt();
        //store day as an int and input into next int
        int day = input.nextInt();
        //refer back to the season method and input the month and day
        String seasonOutput = season(month, day);
        //the season is outputted after going through the method 
        System.out.println("It's" + seasonOutput + "!!!");
    }

}
