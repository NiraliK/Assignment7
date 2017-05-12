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
public class A7Q2 {
    //method create to find the associated letter grade
    private static char examGrade(int mark) {
        char grade = 'y';
        //mark is under 50% the grade is F
        if (mark < 50) {
            grade = 'F';
        //mark is under or equal to 59 the grade is D
        } else if (mark <= 59) {
            grade = 'D';
        //mark is under or equal to 69 the grade is C
        } else if (mark <= 69) {
            grade = 'C';
        //mark is under or equal to 79 the grade is B
        } else if (mark <= 79) {
            grade = 'B';
        //mark is greater or equal to 80 the grade is A 
        } else if (mark >= 80) {
            grade = 'A';
        }
        //return the grade
        return grade;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner created 
        Scanner input = new Scanner(System.in);
        //user prints in the mark and it is stoered as an integer 
        System.out.println("Please enter in a mark:");
        int marks = (int) input.nextDouble();
        //print out the grade in letter form 
        System.out.println("Your grade is: " +examGrade(marks));
    }
    
}
