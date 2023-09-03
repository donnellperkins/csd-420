/**
 * Donnell Perkins
 * Due Date: 09/03/2023
 * 
 * Module 5 -  Write a program that reads from a text file and displays
 * all non-duplicate words in ascending order and then in descending 
 * order.
 * Resources:
 * https://www.tutorialspoint.com/how-to-sort-treeset-in-descending-order-in-java#:~:text=To%20sort%20TreeSet%20in%20descending%20order%2C%20use%20the%20descendingSet(),elements%20contained%20in%20this%20set.
 * https://www.geeksforgeeks.org/read-file-into-an-array-in-java/
 */

import java.io.*;
import java.util.*;

public class DperkinsM5NonduplicateWords {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
      // load data from file
      try (BufferedReader myFile =
          new BufferedReader(new FileReader("./collection_of_words.txt"));
          ) {
          
          // list that will hold the strings from file
          List<String> string_list = new ArrayList<String>();

          String each_word = myFile.readLine();
          
          while (each_word != null) 
          {
              string_list.add(each_word);
              each_word = myFile.readLine();
          }

          // Created the TreeSet (naturally ascending order)
          TreeSet<String> ascend_word = new TreeSet<String>(string_list);
          
          // Display the words from File
          System.out.println("*** Strings from the File in ascending order ***");
          
          // Display words in ascending order
          System.out.print(ascend_word);

          System.out.println("\n");

          // Created the TreeSet for descending order 
          TreeSet<String> descend_word = (TreeSet<String>) ascend_word.descendingSet();
          
          // Display the words from File
          System.out.println("*** Strings from the File in descending order ***");
          
          // Display words in ascending order
          System.out.print(descend_word);
          
          // Close the file
          myFile.close();
      } 
      
      catch(IOException ioe){
      }
  }
}