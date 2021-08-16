/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter63x13;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Joe
 */
public class Chapter63x13 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Circle ring = null;
        int radius;
        Random generator = new Random();
        
        for (int count =1; count <= 10; count++)
        {
            radius = generator.nextInt(150);
            ring = new Circle(200, 200, radius);
            ring.setFill(null);
            ring.setStroke(Color.BLACK);
            root.getChildren().add(ring);
            
        }
              
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Concentric Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        launch(args);
    }*/
    
}
