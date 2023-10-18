/**
 * Donnell Perkins
 * Due Date: 09/10/2023
 * 
 * Module 6 -  Write a program with the two following generic methods using
 * a bubble sort. The first method sorts the elements using the Comparable
 * interface, and the second uses the Comparator interface. 
 */

import java.util.Comparator;

public class DperkinsM6ComparableComparator {
	/* Turns the list of strings sent in into numbers and compare
  * them to each other to decide whether to "bubble" the
  * string in the list. Placing them in ascending order using Comparable class.
  **/
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
	  bubbleSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
	}

  // This will sort the list as is into ascending order
  // using Comparator class.
	public static <E> void bubbleSort(E[] list,
	    Comparator<? super E> comparator) {
		boolean needNextPass = true;
    /*
    * Using the compare method we compare each object in the given 
    * string with the object in front of it to decided whether to
    * shift the current object. 
    */
		for (int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (comparator.compare(list[i], list[i + 1]) > 0) {
					/*
          * If the current object is greater than the next object 
          * have those objects switch places. This will continue 
          * until the list is sorted
          */
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; 
				}
			}
		}
	}

  // This allows the program to run.
  // Calling the appropriate classes to perform sorting task. 
  public static void main(String[] args) {
    // Create an integer array
    Integer[] num_list = {2, -3, 2, -5, 6, 1, -2, 3, -14, 12};
    
    // Print the list before sorting
    System.out.println("The array before sorting");
    for (int i = 0; i < num_list.length; i++) {
      System.out.print(num_list[i] + " ");
    }

    System.out.println("\n------ after sorting -----");

    // Pass the array to the bubbleSort (Comparable) class to be sorted
    bubbleSort(num_list);

    // After the array has been sorted. Print each element in
    // the list
    for (int i = 0; i < num_list.length; i++) {
      System.out.print(num_list[i] + " ");
    }

    System.out.println("\n");

    // Create an String array
    String[] kitchen = {"Fat", "Bread", "Tangerine", "grapes", "Apple", "Chips", "duck"};

    // Print the list before sorting
    System.out.println("The array before sorting");
    for (int i = 0; i < kitchen.length; i++) {
      System.out.print(kitchen[i] + " ");
    }

    System.out.println("\n------ after sorting -----");

    // Pass the array to the bubbleSort (Comparator) class to be sorted
    bubbleSort(kitchen, (s1, s2) -> s1.compareToIgnoreCase(s2));

    // After the array has been sorted. Print each element in
    // the list
    for (int i = 0; i < kitchen.length; i++) {
      System.out.print(kitchen[i] + " ");
    }
  }
}
