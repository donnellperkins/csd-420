/**
 * Donnell Perkins
 * Due Date: 09/17/2023
 * 
 * Module 7 - Write a program that displays four circles and
 * uses the style class and ID.  
 * 
 */
package m7stylesheetjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class M7StyleSheetJavaFX extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(5);
        Scene scene = new Scene(hBox, 300, 250);
        scene.getStylesheets().add("mystyle.css"); // Load the stylesheet

        Pane pane1 = new Pane();
        Circle circle1 = new Circle(40, 125, 30);
        pane1.getChildren().add(circle1);
        pane1.getStyleClass().add("border");
        
        circle1.getStyleClass().add("plaincircle"); // Add a style class
        
        Pane pane2 = new Pane();
        Circle circle2 = new Circle(30, 125, 30);
               
        circle2.getStyleClass().add("plaincircle"); // Add a style class
        
        Circle circle3 = new Circle(95, 125, 30);
                
        circle3.setId("redcircle"); // Add a style id
        
        Circle circle4 = new Circle(160, 125, 30);
        circle4.getStyleClass().addAll("circleborder", "plainCircle");
        circle4.setId("greencircle"); // Add a style class
        pane2.getChildren().addAll(circle2, circle3, circle4);

        hBox.getChildren().addAll(pane1, pane2);

        primaryStage.setTitle("Module 7 StyleSheet & JavaFX"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
       }
    
    public static void main(String[] args) {
         launch(args);
    }
    
}
