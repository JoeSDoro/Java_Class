/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5ex4;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Joe
 */
public class Chapter5ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numberEntered = 0;
        int numberRandom = 0;
        int guesses = 0;
        int again = 1;
        
        final int MAX = 100;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
                
        while (again == 1)
        {
            numberRandom = generator.nextInt(MAX) + 1;
            while (numberEntered != 101)
            {
                System.out.println("Guess a number between 1 and 100. If you want to quit the game enter 101. ");
                numberEntered = scan.nextInt();
                
                guesses = guesses+1;

                if (numberEntered > numberRandom)
                {
                    System.out.println("The number you guessed is too high!");
                }
                if (numberEntered < numberRandom)
                {
                    System.out.println("The number you guessed is too low!");
                }
      
                if (numberEntered == numberRandom)
                {
                    System.out.println("You guessed Correctly! The number was " + numberRandom);
                    System.out.println("It took you " + guesses + " attempts.");
                    numberEntered = 101;
                }                
            }
            
        numberEntered = 0;
        numberRandom = 0;
        guesses = 0;
        
        System.out.println("Do you want to play again?");
        System.out.println("Enter 1 if you want to try again, enter any other number to quit.");
        again = scan.nextInt();
        }  
    }
    
}
