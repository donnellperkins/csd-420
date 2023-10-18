/**
 * Donnell Perkins
 * Due Date: 10/01/2023
 * 
 * Module 10 - Viewing and updating a database using buttons. 
 * Resource: 
 * Chapter 34.4.2 additional resource.
 */
package m10viewupdatejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class M10ViewUpdateJDBC extends Application {
    // Executing queries
    private Statement stmt;
    private TextField record = new TextField();
    private TextField fName = new TextField();
    private TextField lName = new TextField();
    private TextField favTeam = new TextField();
    private Label seperator = new Label();
    private Label stat = new Label();
    Connection con;
    
    @Override 
    public void start (Stage primaryStage) {
        initializeDB();
        
        Button displaybt = new Button("View Record");
        Button updatebt = new Button("Update Record");
        HBox hBox1 = new HBox (5);
        hBox1.getChildren().addAll(new Label("Record"), record,(displaybt));
        
        seperator.setText("Update Record");
        
        HBox hBox2 = new HBox (5);
        hBox2.getChildren().addAll(new Label("First Name: "), fName);        
        
        HBox hBox3 = new HBox (5);
        hBox3.getChildren().addAll(new Label("Last Name: "), lName);
        
        HBox hBox4 = new HBox (5);
        hBox4.getChildren().addAll(new Label("Favorite Team: "), favTeam);
        
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox1, seperator,hBox2, hBox3,hBox4, updatebt, stat);
        
        record.setPrefColumnCount(6);
        record.setOnAction(e-> {
            displaybt.setText("View Record " + record.getText());
                });
        displaybt.setOnAction(e-> {
            showRecord();
            displaybt.setText("View Record " + record.getText());
                });
        updatebt.setOnAction(e->updateRecord());
        // Creating the scene
        Scene scene = new Scene(vBox, 420,275);
        primaryStage.setTitle("View and Update Records");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    private void initializeDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/databasedb?";
            
            con = DriverManager.getConnection(url + "user=student1&password=pass");
            
            stmt = con.createStatement();
        }
        catch(Exception e){

          System.out.println("Error connection to database.");
          System.exit(0);
        }
    }
    
    private void showRecord() {
        String record_strg = record.getText();
        try {
            String queryString = "SELECT *" +
              "FROM fans WHERE ID = "+ record_strg;
            
            ResultSet rset = stmt.executeQuery(queryString);
            
            if (rset.next()) {
                String firstname = rset.getString(2);
                String lastname = rset.getString(3);
                String favteam = rset.getString(4);
                
                // Display result in a label
                stat.setText(firstname + " " + lastname + " favorite team is " +
                       favteam);
            } else {
                stat.setText("Not Found");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void updateRecord() {
        String record_strg = record.getText();
        String fstrgName = fName.getText();
        String lstrgName = lName.getText();
        String favTeamstrg = favTeam.getText();
        try {
            String updateString = "UPDATE fans SET firstname = '" + fstrgName + 
                    "'" + ", lastname = '" + lstrgName + "'" + 
                    ", favoriteteam = '"+ favTeamstrg + "'" +
                    " WHERE ID = '" + record_strg + "'";
            
            stmt.executeUpdate(updateString);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
