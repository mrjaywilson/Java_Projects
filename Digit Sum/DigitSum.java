/** 
* 	Program:	Sum All Digits Program
*	File:		DigitSum.java 
*	Summary:	Gets a number from the user that is a positive integer of
*				digits, and adds each of them together.
*					Example: 12345 == 1 + 2 + 3 + 4 + 5 == 15
* 	Author:		Jay Wilson
*	Date:		October 19, 2017
**/

// Import all necessary classes
import java.util.Scanner;

public class DigitSum {

	// Main entry point of program
	public static void main(String[] args) {

		// Declare and initialize variables and objects
		Scanner sc = new Scanner(System.in);
		String result = "";
		int calc = 0;
		int divNum = 10000;
		
		// Prompt user for input
		System.out.println("Enter a 5 digit number: ");
		
		// Get user input and assign to 'answer'
		int answer = sc.nextInt();
			
		// Loop through and add up all the digits, store in 'calc'
		// Additionally, store each digit in 'result' to print to user
		// Loop for calculations
		for (int i = 0; i < 5; i++) {
			// Store numbers in string for output
			result += ((answer / divNum) % 10) + " + ";
			
			// Add up all the numbers by first dividing the number by
			// divNum and getting the result after modulus
			calc += ((answer / divNum) % 10);
			
			// Reduce the division number by one '0'
			// To get the number to run against modulus
			divNum /= 10;
		}

		// After the loop finishes, clean up the end of the string
		// and remove the the additional '+'.
		// Add on the correct string sequence to complete the output.
		result = result.substring(0, result.length() - 2);
		result += "equals " + calc + ".";
		
		// Print output to user.
		System.out.println("The sum of the digits " + result);
		
		// Clean up
		sc.close();
	}
}
