/** 
* 	Program:	Calculate Celsius and Fahrenheit
*	File:		CalcTemp.java 
*	Summary:	Calculates Celsius based on a given Farhenheit, and calculate Farhenheit
*				based on a given Celsius.
* 	Author:		Jay Wilson
*	Date:		October 24, 2017
**/

import java.util.Scanner;

public class CalcTemp {

	// Main program entry-point
	public static void main(String[] args) {
		
		// Initialize scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for input to convert
		System.out.printf("Enter a fahrenheit temperature: ");
		
		// Get input and store in variable
		double temp = sc.nextDouble();
		
		// Perform calculation, and store value back in variable
		double calc = (temp - 32) * 5 / 9;
		
		// Output to console the result of the calculation
		System.out.printf("\n%s°F is equivalent to %s°C.", temp, calc);

		// Prompt user for additional input to convert
		System.out.printf("\n\nEnter a celsius temperature: ");
		
		// Get input and store in variable
		temp = sc.nextDouble();
		
		// Calculate celsius and store back into variable
		calc = (temp * 9 / 5) + 32;
		
		// Output conversion of fahrenheit to celsius
		System.out.printf("\n%s°C is equivalent to %s°F.", temp, calc);
		
		// Clean up
		sc.close();
		}
}