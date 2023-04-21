package q4;

import java.util.Scanner;

/**
 * <p>
 * This program converts a 5 character string into a number, then decodes it 
 * back to that string.
 * </p>
 * 
 * <p>
 * This program gets the user to enter a 5 character string. The program stores
 * each letter in an index position and converts each of them to a number. It
 * uses the numbers as digits in base 56. It calculates each digit's value by 
 * multiplying each char's number by the Math class method Math.pow. The
 * Math.pow has parameters that multiply 56 (the base number) by the number's
 * place/spot in the entire number. The 5 digits get concatenated together to
 * form the encoded value. They are stored in a string, which gets printed to
 * the console. To decode the value, the program gets the remainder of the 
 * encoded value divided by the base number, which is 56. It calculates this 
 * for each digit. It then divides the encoded value by 56 to move each value
 * into their designated place. To change the digits back into chars, subtract 
 * the remainder by 1 and use arithmetic for chars by adding 'A' to the number.
 * each integer gets casted to a char. The chars are concatenated together and
 * stored in a string for the decoded value. This value is printed to console.
 * </p>
 *
 * @author Monica
 * @version 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {    
        // Create 5 char variables to store each character
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;
        
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.println("Enter a string:");
        
        // Variable to get user's input
        String input = scan.nextLine();
        
        // Variables for each index position
        final int index0 = 0;
        final int index1 = 1;
        final int index2 = 2;
        final int index3 = 3;
        final int index4 = 4;

        // Store each character in an index
        c1 = input.charAt(index0);
        c2 = input.charAt(index1);
        c3 = input.charAt(index2);
        c4 = input.charAt(index3);
        c5 = input.charAt(index4);
        
        // Convert each char to its numeric value
        int numValue1 = c1 - 'A' + 1;
        int numValue2 = c2 - 'A' + 1;
        int numValue3 = c3 - 'A' + 1;
        int numValue4 = c4 - 'A' + 1;
        int numValue5 = c5 - 'A' + 1;
        
        // Represents the place of each digit (4,3,2,1,0)
        final int fourthPlace = 4;
        final int thirdPlace = 3;
        final int secondPlace = 2;
        final int firstPlace = 1;
        final int zeroPlace = 0;
        
        // Represents base 56
        final int fiftySix = 56;
        
        // Use the 5 values as digits
        // Calculate resulting value by alternating 
        // multiplication by base 56 and the next digit place
        int d1 = (int) (numValue1 * Math.pow(fiftySix, fourthPlace));
        int d2 = (int) (numValue2 * Math.pow(fiftySix, thirdPlace));
        int d3 = (int) (numValue3 * Math.pow(fiftySix, secondPlace));
        int d4 = (int) (numValue4 * Math.pow(fiftySix, firstPlace));
        int d5 = (int) (numValue5 * Math.pow(fiftySix, zeroPlace));
                
        // Store encoded value
        int encoded = d1 + d2 + d3 + d4 + d5;
        
        // Print the encoded integer
        System.out.println("Encoded: " + encoded);
        
        // Decode the value by using remainder of the encoded digit
        // Divide by 56 to move the remaining digits down 1 place
        int remainder1 = encoded % fiftySix;
        encoded /= fiftySix;
        
        int remainder2 = encoded % fiftySix;
        encoded /= fiftySix;
        
        int remainder3 = encoded % fiftySix;
        encoded /= fiftySix;
        
        int remainder4 = encoded % fiftySix;
        encoded /= fiftySix;
        
        int remainder5 = encoded % fiftySix;
        encoded /= fiftySix;
        
        // Convert each digit back to a char
        c1 = (char) (remainder5 - 1 + 'A');
        c2 = (char) (remainder4 - 1 + 'A');
        c3 = (char) (remainder3 - 1 + 'A');
        c4 = (char) (remainder2 - 1 + 'A');
        c5 = (char) (remainder1 - 1 + 'A');
        
        // Decoded value is all the letters concatenated together
        String decoded = String.valueOf(c1) + String.valueOf(c2)
            + String.valueOf(c3) + String.valueOf(c4) + String.valueOf(c5);
        
        // Print the 5 decoded characters
        System.out.println("Decoded: " + decoded);
        
        // Close the scanner
        scan.close();
    }
    
}
