/**
 * Donnell Perkins
 * Due Date: 06/27/2023
 * 
 * Module 3 -  Create a program that contains a static method that 
 * returns a new ArrayList.
 * Resources: 
 * https://www.geeksforgeeks.org/how-to-remove-duplicates-from-arraylist-in-java/
 */

import java.util.*;

 public class DperkinsM3GenericArrayList {
     public static void main(String[] args) {
        // Create a list
        ArrayList<Integer> intList = new ArrayList<>();
        
        // Creates the array 50 random number (1-20) and add them to a list
        for (int i = 0; i < 50; i++) {
            Random rando = new Random();
            int randomInt = rando.nextInt(20);
            intList.add(randomInt);
        }

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                           + intList);

        // Remove the duplicates from the array
        ArrayList<Integer> new_intList =
            DperkinsM3GenericArrayList.removeDuplicates(intList);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                           + new_intList);
        
    }
    // When this method is called it removes the duplicates from the given array
    public static <E> ArrayList <E> removeDuplicates(ArrayList<E> list) {
        // Create new list for the non duplicates
        ArrayList<E> new_intList = new ArrayList<E>();
        
        // Sort through each item and add the non duplicates to the new array
        for (E element : list) {
            if (!new_intList.contains(element)) {
                new_intList.add(element);
            }
        }
        
        // Return the new list
        return new_intList;
    }
 }