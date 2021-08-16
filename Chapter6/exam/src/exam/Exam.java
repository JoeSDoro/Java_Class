/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Joe
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 3;
        switch (x)
 {
    case 3 : x += 1;
    case 4 : x += 2;
    case 5 : x += 3;
    case 6 : x++;
    case 7 : x += 2;
    case 8 : x--;
    case 9 : x++;
 }
System.out.println(x);
    }
    
}
