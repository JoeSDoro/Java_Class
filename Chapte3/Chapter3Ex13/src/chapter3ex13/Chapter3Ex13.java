/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3ex13;

/**
 *
 * @author Joe
 */

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;


public class Chapter3Ex13 extends Application{


    public void start(Stage primaryStage) {
        
        int radius;
        Random generator = new Random();
        
        radius = generator.nextInt(100) + 50;
        
        Circle circle = new Circle (200, 200, radius);
        
        Group root = new Group(circle);
        Scene scene = new Scene(root, 400, 400);
       
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
