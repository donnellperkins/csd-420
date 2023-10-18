/**
 * Donnell Perkins
 * Due Date: 09/17/2023
 * 
 * Module 8 - Write a program, in that program create a class to use three
 * threads to output three types of characters to a text area for display.
 * Displaying characters, numbers, and punctuation. 10,000 each.
 * Resource: 
 * https://programming.guide/java/generate-random-character.html
 */
package donnellthreethreads;

import static donnellthreethreads.DonnellThreeThreads.TIME;
import java.util.Random;

public class DonnellThreeThreads {
    public static final int TIME = 10001;
    
    public static void main(String[] args) {
        
        // Create tasks
        Runnable printRandomChar = new PrintChar();
        Runnable printRandomSymbol = new PrintSym();
        Runnable printRandomNumber = new PrintNum();
        
        // Create threads
        Thread thread1 = new Thread(printRandomChar);
        Thread thread2 = new Thread(printRandomSymbol);
        Thread thread3 = new Thread(printRandomNumber);
        
        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// The task for printing a character
class PrintChar implements Runnable {
    private char charToPrint; // The character to print

    @Override
    /** Override the run() method to tell the system
    * what task to perform
    */
    public void run() {
       Random rand = new Random();
       
       for (int i = 0; i < TIME; i++) {
           char c = (char) ('a' + rand.nextInt(26));
           charToPrint = c;
           System.out.println(charToPrint);
           i += 1;
        }
    }
}

// The task for printing a specific symbol
class PrintSym implements Runnable {
    private char symToPrint; // The character to print

    @Override
    /** Override the run() method to tell the system
    * what task to perform
    */
    public void run() {
        Random rand = new Random();
        // Choosing a random symbol from this string
        String specific_sym = "!@#$%&*";
        
        for (int i = 0; i < TIME; i++) {
            char sym = specific_sym.charAt(rand.nextInt(specific_sym.length()));
            symToPrint = sym;
            System.out.println(symToPrint);
            i += 1;
        }
    }
}

// The task class for printing random numbers 0 to 9
class PrintNum implements Runnable {
    private int rand_num;

    @Override /** Tell the thread how to run */
    public void run() {
        Random rand = new Random();
        
        for (int i = 0; i < TIME; i++) {
            rand_num = rand.nextInt(10);
            System.out.println(rand_num);
            i += 1;
        }
    }
}


