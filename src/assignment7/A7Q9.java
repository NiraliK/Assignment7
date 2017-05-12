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
public class A7Q9 {

    //method created to determine all the odd numbers 
    public static boolean allDigitsOdd(int[] digits) {
        //boolean created to set odd as true 
        boolean odd = true;
        //for loop created, to go through the array and divide each number by 2
        //if remander is equall to 0 then it is even number if there is a remander then its a odd 
        for (int i = 0; i < digits.length; i++) {
            //if number is divisiable by 2 then set odd as false 
            if (digits[i] % 2 == 0) {
                odd = false;
            }
        }
        //return the odd 
        return odd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner created 
        Scanner input = new Scanner(System.in);
        //ask user to enter in a number 
        System.out.println("Enter a number:");
        //Convert the integer into a string then store it as temp
        //input the temp in the next int 
        String temp = Integer.toString(input.nextInt());
        //a new integer array called number
        int[] numbers = new int[temp.length()];
        //for loop created to go through all the numbers and then stores them into string temp 
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        //if statement(loop) created to output the answer 
        if (allDigitsOdd(numbers)) {
            //if the numbers are all odd then it is outputted 
            System.out.println("All the digits are odd!");
            //else if the number has an even variable the following is outputed 
        } else {
            System.out.println("There are even digits in the number!!");
        }

    }

}
