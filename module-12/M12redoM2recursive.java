/*
 * Donnell Perkins
 * Due Date: 10/07/2023
 * 
 * Module 12 - Redo Module 2: Create a program that uses a recursive method.
 * The method should return the sum of m(i) = i/(i + 1).
 * Resources:
 * Thank you for your Feedback!
 */

 package M12recursive;

 import java.util.Scanner;

 public class M12redoM2recursive {
    public static void main (String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a non-negative number: ");
            int n = input.nextInt();

            // Display Equation
            System.out.println("Factorial of " + n + " is " + fact(n));
        } finally {
            //Close Scanner
            input.close();
        }
    }

    // Enter input value into the equation and return the sum.
    public static double fact (int num) {
        if (num == 1)
        {
            return 1.0 / 2.0;
        }

        return ((double) num / (num + 1)) + fact(num - 1);
    }
 }