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
public class A7Q3 {
    //method created to find the factors of a number
    public static void factors(int number) {
        //print out the factor of the number 
        System.out.println("The factors of " +number+ "are:");
        //for loop created go through 1 to the number entered
        for (int i = 1; i <= number; i++) {
            double answer = number/ i;
            //if there are no remanders then print out the factorss
            if(number % i == 0) {
                System.out.println((int) answer);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner is created
        Scanner input = new Scanner(System.in);
        //ask user to enter a number to find the factors of 
        System.out.println("Enter a number: ");
        int number = (int) input.nextDouble();
        //refer back to the method to find all the factors 
        factors(number);
    }
    
}
