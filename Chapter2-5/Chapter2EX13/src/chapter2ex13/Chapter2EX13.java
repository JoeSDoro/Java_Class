/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2ex13;

/**
 *
 * @author Joe
 */

import java.util.Scanner;

public class Chapter2EX13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numerator;
        double denominator;
        double decimal;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Numerator of the fraction: ");
        numerator = scan.nextDouble();
        
        System.out.println("Enter the Denominator of the fraction: ");
        denominator = scan.nextDouble();
        
        decimal = numerator / denominator;
        
        System.out.println("Your fraction was: " + numerator + "/" + denominator);
        System.out.println("That fraction in decimal is: " + decimal);
    }
    
}
