/*
 * Donnell Perkins
 * Due Date: 08/13/2023
 * From Module 1 - Storing the integer, the date , and a double value in a
 * .dat file.
 */
package M1StoringAssignment;

import java.io.*;

public class StoringRandValues {
    public static void main (String[] args)
            throws IOException, ClassNotFoundException {
        int [] nums = new int[6];
        double[] dub_nums = new double [6];
        // Create the OutputStream
        try (ObjectOutputStream myFile = 
                    new ObjectOutputStream(new FileOutputStream("./dperkins_datafile.dat"));
            ){
            // Creating the array of random integers 
            for(int i = 1; i < 6; ++i){
                nums[i] = (int)(Math.random() * i * 7);
            }
            myFile.writeObject(nums);
            
            // Insert Today's Date
            myFile.writeObject(new java.util.Date());
            
            // Creating the array of random Double Values
            for(int i = 1; i < 6; ++i){
                dub_nums[i] = Math.random() * i * 7;
            }
            myFile.writeObject(dub_nums);
        }
        catch(IOException ioe){
        }
    }
}
