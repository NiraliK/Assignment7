package assignment7;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class A7Q4 {

    //method created to determine the compount interest 
    public static double compoundInterest(double principal, double interest, int years) {
        //calculations to find the balance 
        double balance = principal * Math.pow(1 + interest, years);
        //balance is returned
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner created 
        Scanner input = new Scanner(System.in);
        //tell user about the purpose of this program
        System.out.println("This program will help find the balance of your account after a compund interest is added.  ");
        //ask user for principal amount and store it as a double
        System.out.println("Enter the principal amount:");
        double intialAmount = input.nextDouble();
        //ask user for the interest rate in a percantage and store it as a double 
        System.out.println("Enter in the interest rate(percent) :");
        double interest = input.nextDouble() / 100;
        //ask user for the number of years and save it as an integer 
        System.out.println("Enter in the number of years: ");
        int years = input.nextInt();
        //round to two decimal places 
        DecimalFormat n = new DecimalFormat("###.##");
        //output the final compound interest 
        System.out.println("Your compound interest is: $" + n.format(compoundInterest(intialAmount, interest, years)));

    }

}
