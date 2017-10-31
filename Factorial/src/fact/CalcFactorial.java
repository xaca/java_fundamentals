/**
 * 
 */
package fact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculates the factorial of a number entered by the user.
 * 
 * @author shivanishirolkar
 */
public class CalcFactorial {

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
		try {
			System.out.print("Enter the number: ");
			String userInput = br.readLine();
			System.out.println("The factorial is " + calcFact(Integer.parseInt(userInput)));
		} catch (IllegalArgumentException e) {
			System.out.print("Invalid input.");
		}
	}

	/**
	 * Calculates the factorial of a number.
	 * 
	 * @param n
	 *            Number
	 * @return the factorial
	 */
	public static int calcFact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}
}
