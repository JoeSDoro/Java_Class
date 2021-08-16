/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2ex5;

/**
 *
 * @author Joe
 */

import java.util.Scanner;

public class Chapter2Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        double tempF;
        double tempC;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a temperature in Fahrenheit: ");
        tempF = scan.nextDouble();
        
        tempC = (tempF - BASE) / CONVERSION_FACTOR;
        
        System.out.println("Fahrenheit Temperature: " + tempF);
        System.out.println("Celsius Temperature: " + tempC);
    }
    
}
