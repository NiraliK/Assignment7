/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import static assignment7.MethodsExample.volumeOfCylinder;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A7Q1 {

    // Method created to find the area of the circle 
    public static double circleArea(double radius) {
        //calculate the area (radius*pie*2)
        double area = Math.PI * Math.pow(radius, 2);
        //return the area
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Scanner created 
        Scanner input = new Scanner(System.in);
        //ask user to enter in the radius 
        System.out.println("Enter in the radius:");
        //store the radius as a double (number)
        double number = input.nextDouble();
        //round to two decimal places
        DecimalFormat n = new DecimalFormat("###.##");
        //putput the area of the circle after going through the method
        System.out.println("The area of the circle is " + n.format(circleArea(number)));

    }

}
