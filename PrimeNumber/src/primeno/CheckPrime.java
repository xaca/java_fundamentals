/**
 * 
 */
package primeno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Checks if a number entered by the user is prime or not.
 * 
 * @author shivanishirolkar
 *
 */
public class CheckPrime {

	/** The user's input as an integer */
	private static int input;

	/**
	 * Interacts with the user.
	 * 
	 * @param args
	 *            Command line argument (not used)
	 * @throws IOException
	 *             if there is an error in input/output
	 */
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		String userInput = br.readLine();
		try {
			input = Integer.parseInt(userInput);
			if (isPrime(input) == true) {
				System.out.println("The number is prime.");
			} else {
				System.out.println("The number is not prime.");
			}
		} catch (IllegalArgumentException e) {
			System.out.print("Non numeric value entered.");
		}
	}

	/**
	 * Determines if the parameter is a prime number.
	 * 
	 * @param number
	 *            The number
	 * @return whether prime or not
	 */
	public static boolean isPrime(int number) {
		int factor = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factor++;
			}
		}
		if (factor == 2) {
			return true;
		}
		return false;
	}
}
