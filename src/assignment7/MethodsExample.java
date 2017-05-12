/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author niralikantaria
 */
public class MethodsExample {

    //method to say hello 
    public static void sayHello () {
        System.out.println("Hello!");   
    }
    //overloaded method.. has parametres 
    //say hello to a specific person 
    /**
     * day hello to a specific name
     * @param name  the name of the user 
     */
    public static void sayHello(String name) {
        System.out.println("Hello!" +name); 
    }
    /**
     * calculates the volume of a cylinder
     * @param radius the radius of the cylinder 
     * @param height the height of the cylinder 
     * @return the volume of the cylinder with the radius and the height 
     */
    public static double volumeOfCylinder(double radius, double height) {
        //calculate the volume 
        double rSquared = Math.pow(radius, 2); 
        double volume = Math.PI*rSquared*height;
        return volume; //send back the answer 
           
    }
    
    public static void addFive(int num) {
        num = num +5;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //caling the saHello method
        String n = "Fred";
        sayHello();
        sayHello("Bob!");
        sayHello(n);
        
        //radius = 10, height = 15 
        double answer = volumeOfCylinder(10,15);
        System.out.println(answer);
        
        int[] num = {10,15,20}; 
        
        System.out.println(num);
    }
    
}
