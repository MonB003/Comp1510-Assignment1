package q2;

import java.util.Scanner;

/**
 * <p>
 * This program calculates ten estimate square roots of a number.
 * </p>
 * 
 * <p>
 * This program gets the user to enter a number. Then, it calculates the first
 * square root by adding 1 to the user's number, then dividing the sum by 2.
 * For the next nine estimated square roots, it divides the user's number by
 * the previous square root, then adds that quotient to the previous square
 * root value. Next, it divides that sum by 2. The program repeats this
 * equation for the next nine square roots and print each of the values to
 * the console.
 * </p>
 *
 * @author Monica
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {        
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter a number:");
        
        // Variable to store user's input
        double a = scan.nextDouble();
        
        // Variable to store first square root estimate
        double s = (a + 1) / 2;
        
        // Print the first estimate
        System.out.println("First estimate: " + s);
        
        // Store second square root estimate
        s = (s + a / s) / 2;
        
        // Print the second estimate
        System.out.println("Second estimate: " + s);
        
        // Store third square root estimate
        s = (s + a / s) / 2;
        
        // Print the third estimate
        System.out.println("Third estimate: " + s);
        
        // Store fourth square root estimate
        s = (s + a / s) / 2;
        
        // Print the fourth estimate
        System.out.println("Fourth estimate: " + s);
        
        // Store fifth square root estimate
        s = (s + a / s) / 2;
        
        // Print the fifth estimate
        System.out.println("Fifth estimate: " + s);
        
        // Store sixth square root estimate
        s = (s + a / s) / 2;
        
        // Print the sixth estimate
        System.out.println("Sixth estimate: " + s);
        
        // Store seventh square root estimate
        s = (s + a / s) / 2;
        
        // Print the seventh estimate
        System.out.println("Seventh estimate: " + s);
        
        // Store eighth square root estimate
        s = (s + a / s) / 2;
        
        // Print the eighth estimate
        System.out.println("Eighth estimate: " + s);
        
        // Store ninth square root estimate
        s = (s + a / s) / 2;
        
        // Print the ninth estimate
        System.out.println("Ninth estimate: " + s);
        
        // Store ten square root estimate
        s = (s + a / s) / 2;
        
        // Print the tenth estimate
        System.out.println("Tenth estimate: " + s);
        
        // Close the scanner
        scan.close(); 
    }

}
