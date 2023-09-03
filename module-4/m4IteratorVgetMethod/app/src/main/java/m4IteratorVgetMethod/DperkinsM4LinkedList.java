/**
 * Donnell Perkins
 * Due Date: 06/27/2023
 * 
 * Module 4 -  Create a program that  stores integers in LinkedList.
 * Test the time to traverse the list using an iterator vs. using the 
 * get(index) method.
 */
package m4IteratorVgetMethod;

import java.util.*;

public class DperkinsM4LinkedList {
    public static void main(String[] args) {
        // Create a LinkedList 
        LinkedList <Integer> int_list = new LinkedList<>();
        
        // Creates the array 50,000 random number (1-100) and add them to a list
        for (int i = 0; i < 50000; i++) {
            Random rando = new Random();
            int randomInt = rando.nextInt(100);
            int_list.add(randomInt);
        }
        
        /* Iterating through the list
         *  Using Iteration does not take as long to process
         **/
        //Iterator<Integer> iterator = int_list.iterator();
        //while (iterator.hasNext()) {
        //    System.out.print(iterator.next() + "\n");
        //}
        
        /* Using the get method to display each item in a list
         * Takes longer to process
         **/
        for (Integer ints: int_list) {
            int intListItem = int_list.get(ints);
            System.out.println(intListItem);
        }
    }
}
