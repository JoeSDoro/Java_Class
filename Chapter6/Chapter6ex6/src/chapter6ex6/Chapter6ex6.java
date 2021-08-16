/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6ex6;

/**
 *
 * @author Joe
 */
public class Chapter6ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coin myCoin = new Coin();
        int heads = 0;
        int tails = 0;
        
        int count = 0;
        do
        {
            count++;
            myCoin.flip();
            if(myCoin.isHeads() == true)
                heads++;
            else
                tails++;
        }
        while (count < 100);
        
        System.out.println("There were " + heads + " heads");
        System.out.println("There were " + tails + " tails");
        
    }
    
}
