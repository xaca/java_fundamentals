/**
 * 
 */
package season;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shivanishirolkar Determines which season it is depending on month,
 *         which is entered by the user.
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
		switch (month) {
		case "November":
		case "December":
		case "January":
		case "February":
			season = "It's winter.";
			break;
		case "March":
		case "April":
			season = "It's spring.";
			break;
		case "May":
		case "June":
		case "July":
		case "August":
			season = "It's summer.";
			break;
		case "September":
		case "October":
			season = "It's fall.";
			break;
		default:
			season = "Invalid input.";
		}
		return season;
	}
}
