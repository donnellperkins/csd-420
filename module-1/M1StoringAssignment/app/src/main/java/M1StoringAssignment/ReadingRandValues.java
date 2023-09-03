/*
 * Donnell Perkins
 * Due Date: 08/13/2023
 * From Module 1 Continued - Reading the .dat file and displaying whats in the
 * file.
 */
package M1StoringAssignment;

import java.io.*;

public class ReadingRandValues {
    public static void main (String[] args)
        throws IOException, ClassNotFoundException {
        // Create the InputStream
        try (ObjectInputStream myFile = 
                        new ObjectInputStream(new FileInputStream("./dperkins_datafile.dat"));
            ){
            // Display the Arrays and the Date from File
            System.out.println("*** 5 Integers from the File ***");
            int[] num_values = (int[]) (myFile.readObject());
            for (int i = 1; i < num_values.length; i++)
                System.out.print(num_values[i] + " ");
            System.out.println("\n");
            
            System.out.println("*** Date from the File ***");
            java.util.Date date = (java.util.Date) (myFile.readObject());
            System.out.println(date);
            System.out.println();
            
            System.out.println("*** 5 Double Values from the File ***");
            double[] dub_Nums = (double[]) (myFile.readObject());
            for (int i = 1; i < dub_Nums.length; i++)
                System.out.print(dub_Nums[i] + " ");
            System.out.println();
        }
        
        catch(IOException ioe){
        }
    }
}
