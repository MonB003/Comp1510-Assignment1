package q1;

import java.util.Scanner;

/**
 * <p>
 * This program calculates how many of each coin and dollar a number is equal 
 * to.
 * </p>
 * 
 * <p>
 * This program gets the user to enter a money value. It reads the user's input
 * using the Scanner class. Then, it calculates how many of each dollar bill
 * and coin type that number is equal to. To calculate the total of each bill,
 * divide the user's number by the bill's value (example: for ten dollars, 
 * divide by ten), then cast the result to an integer. Next, subtract the 
 * result by the user's number and multiply that by the bill's value. Do these
 * steps for each bill. For the coins, first multiply the user's number by 100,
 * which converts it to the coin value. Then, repeat the calculation that was
 * done for the bills. At the end, the amount of each bill and coin needed for
 * the user's number is printed.
 * </p>
 *
 * @author Monica
 * @version 1.0
 */
public class Change {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) { 
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Double variable to store user's input
        double userInput;
        
        // Variable used for converting to dollar value
        final int convertDollar = 100;
        
        // Variables for each coin and dollar
        final int tenDollar = 10 * convertDollar;
        final int fiveDollar = 5 * convertDollar;
        final int toonie = 2 * convertDollar;
        final int loonie = 1 * convertDollar;
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        final int penny = 1;
        
        // Variables for each coin for user's input
        int userTen;
        int userFive;
        int userToonie;
        int userLoonie;
        int userQuarter;
        int userDime;
        int userNickel;
        int userPenny;
        
        // Prompt user to enter a number
        System.out.println("Enter a monetary amount:");
        
        // Get user input
        userInput = scan.nextDouble();
        
        // Multiply by one hundred to get dollar value
        userInput *= convertDollar;
        
        // Calculate ten dollars
        userTen = (int) (userInput / tenDollar);
        userInput -= userTen * tenDollar;
        
        // Calculate five dollars
        userFive = (int) (userInput / fiveDollar);
        userInput -= userFive * fiveDollar;
        
        // Calculate toonies
        userToonie = (int) (userInput / toonie);
        userInput -= userToonie * toonie;

        // Calculate loonies
        userLoonie = (int) (userInput / loonie);
        userInput -= userLoonie * loonie;
        
        // Calculate quarters
        userQuarter = (int) (userInput / quarter);
        userInput -= userQuarter * quarter;
        
        // Calculate dimes
        userDime = (int) (userInput / dime);
        userInput -= userDime * dime;
        
        // Calculate nickels
        userNickel = (int) (userInput / nickel);
        userInput -= userNickel * nickel;
        
        // Calculate pennies
        userPenny = (int) (userInput / penny);
        userInput -= userPenny * penny;
        
        // Print the amount of each coin for user's input
        System.out.println(userTen + " ten dollar bills.");
        System.out.println(userFive + " five dollar bills.");
        System.out.println(userToonie + " toonies.");
        System.out.println(userLoonie + " loonies.");
        System.out.println(userQuarter + " quarters.");
        System.out.println(userDime + " dimes.");
        System.out.println(userNickel + " nickels.");
        System.out.println(userPenny + " pennies.");
        
        // Close the scanner
        scan.close();
    }

}
