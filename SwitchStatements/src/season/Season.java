/**
 * 
 */
package season;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Determines which season it is depending on month, which is entered by the
 * user.
 * 
 * @author shivanishirolkar
 */
public class Season {

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
		System.out.print("Enter the full name of the month (Eg: November):");
		String userInput = br.readLine();
		System.out.print(determineSeason(userInput));
	}

	/**
	 * Determines which season it is based on month.
	 * 
	 * @param month
	 *            Month
	 * @return the season
	 */
	public static String determineSeason(String month) {
		String season = null;
		switch (month.toLowerCase()) {
		case "november":
		case "december":
		case "january":
		case "february":
			season = "It's winter.";
			break;
		case "march":
		case "april":
			season = "It's spring.";
			break;
		case "may":
		case "june":
		case "july":
		case "august":
			season = "It's summer.";
			break;
		case "september":
		case "october":
			season = "It's fall.";
			break;
		default:
			season = "Invalid input.";
			break;
		}
		return season;
	}
}
