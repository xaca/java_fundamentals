/**
 * 
 */
package grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shivanishirolkar Determines which remark to print depending on grade,
 *         which is entered by the user.
 */
public class Grades {

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
		System.out.print("Enter your grade (A, B, C, D, F):");
		String userInput = br.readLine();
		System.out.print(determineRemark(userInput.charAt(0)));
	}

	/**
	 * Determines which remark to be printed based on grade.
	 * 
	 * @param g
	 *            Grade
	 * @return the remark
	 */
	public static String determineRemark(char g) {
		String remark = null;
		switch (g) {
		case 'A':
			remark = "Excellent";
			break;
		case 'B':
			remark = "Good";
			break;
		case 'C':
			remark = "Bad";
			break;
		case 'D':
			remark = "Really bad";
			break;
		case 'F':
			remark = "Fail";
			break;
		default:
			remark = "Invalid input.";
			break;
		}
		return remark;
	}
}
