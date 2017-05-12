/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A7Q5 {

    //method created to generate a lines of *
    public static void chaotic(int lines) {
        //random created
        Random rand = new Random();
        //for loop created to go through the number of lines
        for (int i = 0; i < lines; i++) {
            //a random number of * between 5 and 1 is generated
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //space inserted
            System.out.println(" ");
            //for loop created to go through the ranNum and replace with *
            for (int n = 0; n < randNum; n++) {
                //print out *
                System.out.print("*");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner created
        Scanner input = new Scanner(System.in);
        //ask user to enter in the number of lines 
        System.out.println("Enter in the number of lines you would like to generate:");
        //return it to the method 
        chaotic(input.nextInt());
        //print out the end message
        System.out.println(" ");
        System.out.println("DONE!!!");

    }

}
