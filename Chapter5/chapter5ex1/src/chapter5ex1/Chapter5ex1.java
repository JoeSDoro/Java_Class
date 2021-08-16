/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5ex1;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Chapter5ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int year;
        boolean leap;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        year = scan.nextInt();
        
        leap = ((year %4 ==0) && (year % 100 != 0) || (year % 400 == 0));
        
        if (year < 1582)
        {
            System.out.println("This year is before the Gregorian Calendar!");
        }
        else
        {
            if (leap)
            {
                System.out.println(year + " is a leap year!");
            }
            else
            {
                System.out.println(year + " is not a leap year!");
            }
        }
    }
    
}
