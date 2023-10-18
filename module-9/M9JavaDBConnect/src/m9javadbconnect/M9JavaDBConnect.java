/**
 * Donnell Perkins
 * Due Date: 09/24/2023
 * 
 * Module 9 - Verifying that my installation and configuration of java
 *  and mysql is communicating correctly.
 * Resource: 
 * Professor Darrell Payne's Example given in Module 9.
 */
package m9javadbconnect;

import java.net.URL;
import java.sql.*;

// This class is used to create the table.
public class M9JavaDBConnect{

  Connection con;

  Statement stmt;
  // Establish the connection with mysql
  public M9JavaDBConnect(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/database33?";
      
      con = DriverManager.getConnection(url + "user=student33&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }
    
    // Drop the table if it already exist
    try{

      stmt.executeUpdate("DROP TABLE address33");
      System.out.println("Table address Dropped");
    }
    catch(SQLException e){

      System.out.println("Table address does not exist");
    }
    
    // Create the table
    try{

      stmt.executeUpdate("CREATE TABLE address33(ID int PRIMARY KEY,LASTNAME varchar(40)," +
                         "FIRSTNAME varchar(40), STREET varchar(40), CITY varchar(40), STATE varchar(40)," +
                         "ZIP varchar(40))");
      System.out.println("Table address Created");
    }
    catch(SQLException e){

      System.out.println("Table address Creation failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("Database connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    M9JavaDBConnect createTable = new M9JavaDBConnect();
  }
}
