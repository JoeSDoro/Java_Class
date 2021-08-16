/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4ex6;

/**
 *
 * @author Joe
 */
public class BoxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(2, 3, 1);
        Box box3 = new Box(3, 1, 2);
        
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        
    }
    
}
