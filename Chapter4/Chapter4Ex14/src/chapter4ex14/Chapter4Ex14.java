/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4ex14;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.geometry.Pos;

/**
 *
 * @author Joe
 */
public class Chapter4Ex14 extends Application {
    
    private int number;
    private Text numberText;
    
    @Override
    public void start(Stage primaryStage) {
        
       number = 50;
       numberText = new Text("Number: 50");
        
        Button increment = new Button("Increment");
        increment.setOnAction(this::processIncrement);
        
        Button decrement = new Button("Decrement");
        decrement.setOnAction(this::processDecrement);
        
        FlowPane pan = new FlowPane(increment, decrement, numberText);
        pan.setAlignment(Pos.CENTER);
        pan.setHgap(20);
        
        Scene scene = new Scene(pan, 300, 100);
        
        primaryStage.setTitle("Number Value");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void processIncrement(ActionEvent event)
    {
        number++;
        numberText.setText("Number: " + number);
    }
    
    public void processDecrement(ActionEvent event)
    {
        number--;
        numberText.setText("Number: " + number);
    }

   
}
