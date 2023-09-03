/*
 * Donnell Perkins
 * Due Date: 08/20/2023
 * 
 * Module 2 - Create a program that uses a recursive method.
 * The method should return the sum of m(i) = i/(i + 1).
 */

 package M2recursive;

 import java.util.Scanner;

 public class DperkinsM2recursive {
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
    public static double fact (double num) {
        if (num == 0)
        {
            return 1;
        } else {
            return num / (num + 1);
        }
    }
 }