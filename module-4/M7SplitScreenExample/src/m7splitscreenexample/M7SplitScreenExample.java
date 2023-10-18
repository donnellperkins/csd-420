/*
 * Donnell Perkins
 * Module 7 Example for SplitPane JavaFX
 */
package m7splitscreenexample;

// Java program to create a split pane
// and add labels to it
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
  
public class M7SplitScreenExample extends Application {
  
    // launch the application
    public void start(Stage stage)
    {
  
        try {
  
            // set title for the stage
            stage.setTitle("M7 SplitPane Example");
  
            // create a splitpane
            SplitPane split_pane = new SplitPane();
            
            // create labels and add it to splitPane
            StackPane st1 = new StackPane();
            StackPane st2 = new StackPane();
            StackPane st3 = new StackPane();
            
            split_pane.getItems().addAll(st1,st2, st3);
            split_pane.setDividerPositions(0.3f, 0.6f, 0.9f);

            // set Orientation of SplitPane
            split_pane.setOrientation(Orientation.VERTICAL);
            
            // create a scene
            Scene scene = new Scene(split_pane, 500, 300);
  
            // set the scene
            stage.setScene(scene);
  
            stage.show();
            
            // Makes it so the dividers can not be moved
            split_pane.lookupAll(".split-pane-divider").stream()
            .forEach(div ->  div.setMouseTransparent(true) );
        }
  
        catch (Exception e) {
  
            System.out.println(e.getMessage());
        }
    }
  
    // Main Method
    public static void main(String args[])
    {
  
        // launch the application
        launch(args);
    }
}