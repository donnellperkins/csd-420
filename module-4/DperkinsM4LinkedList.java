/**
 * Donnell Perkins
 * Due Date: 06/27/2023
 * 
 * Module 4 -  Create a program that  stores integers in LinkedList.
 * Test the time to traverse the list using an iterator vs. using the 
 * get(index) method.
 */

 import java.util.*;

 public class DperkinsM4LinkedList {
    public static void main(String[] args) {
        // Create a LinkedList 
        LinkedList <Integer> int_list = new LinkedList<Integer>();
        
        // Creates the List of 50,000 random number (1-100) and
        // add them to the list.
        for (int i = 0; i < 50000; i++) {
            Random rando = new Random();
            int randomInt = rando.nextInt(100);
            int_List.add(randomInt);
        }

        /* Iterating through the list
         * Using Iteration DOES NOT take as long to process
         * */
        //Iterator<Integer> iterator = int_list.iterator();
        //while (iterator.hasNext()) {
        //    System.out.print(iterator.next() + "\n");
        //}
        
        /* Get method to display each item in a list.
         * Using the get method takes longer to process
         **/
        for (Integer ints: int_list) {
            int intListItem = int_list.get(ints);
            System.out.println(intListItem);
        }
    }
 }