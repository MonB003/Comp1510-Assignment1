package q3;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * <p>
 * This program calculates a user's discount as a double and percent based on 
 * their input.
 * </p>
 * 
 * <p>
 * This program gets the user to enter the number of cheeses and referrals.
 * The program calculates the user's discount by adding the two numbers
 * they inputed, then storing that value as a double. The Math class method 
 * called Math.min compares the user's discount to the number 75, which
 * is the maximum discount they can get. If the discount is more than 75,
 * they get a 75% discount. Otherwise, the discount is the sum of the numbers
 * they inputed. The program uses the NumberFormat method called format, which
 * returns the discount as a percent. At the end, the program prints the
 * discount as a double and as a percent.
 * </p>
 *
 * @author Monica
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {        
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Variable for maximum discount percent
        final int maximumDiscount = 75;
        
        // Variable for converting percent
        final int convertPercent = 100;
        
        // Create a NumberFormat object to get percent
        NumberFormat fmtDiscount = NumberFormat.getPercentInstance();
        
        // Prompt user to enter the number of cheeses purchased
        System.out.println("Enter the number of cheeses purchased:");
        
        // Variable to get user's input for cheeses purchased
        int numCheese = scan.nextInt();
        
        // Prompt user to enter the number of new customers referred
        System.out.println("Enter the number of new customers referred:");
        
        // Variable to get user's input for new customers referred
        int numReferral = scan.nextInt();
        
        // Calculate discount, which is the sum of 
        // the cheeses purchased and referrals
        double discount = numCheese + numReferral;
        
        // Check if discount exceeds 75% with Math.min
        // If it does, the new discount is 75%
        double newDiscount = Math.min(discount, maximumDiscount);

        // Store result as a percent
        String discPercent = fmtDiscount.format(newDiscount / convertPercent);
        
        // Print the value of the discount
        System.out.println("Value of discount: " + newDiscount);
        System.out.println("Discount as a percent: " + discPercent);
        
        // Close the scanner
        scan.close();
    }

}
