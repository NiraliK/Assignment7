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
public class A7Q6 {

    //method created to indintify the last integer 
    public static int lastDigit(int number) {
        //determine the last integer
        return Math.abs(number % 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner created 
        Scanner input = new Scanner(System.in);
        //ask user to enter in a number 
        System.out.println("Please enter in an integer:");
        int num = input.nextInt();
        //output the last digit
        System.out.println("The last digit is: " + lastDigit(num));

    }

}
