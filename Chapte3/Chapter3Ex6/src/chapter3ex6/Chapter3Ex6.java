/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3ex6;

/**
 *
 * @author Joe
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter3Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double surfaceArea;
        double volume;
        double radius;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        System.out.println("Enter the radius of the sphere in centimeters: ");
        radius = scan.nextDouble();
        
        volume = (4/3) * Math.PI * Math.pow(radius, 3);
        
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        System.out.println("Volume: " + fmt.format(volume));
        System.out.println("Surface Area: " + fmt.format(surfaceArea));
    }
    
}
