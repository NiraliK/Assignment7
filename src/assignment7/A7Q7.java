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
public class A7Q7 {

    //method created to indintify the first integer 
    public static int firstDigit(int number) {
        //while loop created
        //if number is greater than 9 then it is divided until the first digit left 
        while(number >9) {
          number/= 10;
     }
     //number is returned
     return number;
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
        //output the first digit
        System.out.println("The first digit is: " + firstDigit(num));

    }

}
