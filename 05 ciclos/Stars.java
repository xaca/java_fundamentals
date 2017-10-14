
/*
 * Input is a odd number 'n'
 * Output will be a pattern as shown below
 *  ____________________________________________
 * |			input : 5 						|
 * |*											|
 * |***											|
 * |*****										|
 * |***											|
 * |*											|
 *  ____________________________________________ 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stars {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(br.readLine());
		int increasing_lines = (lines / 2) + (lines % 2), decreasing_lines = lines
				- increasing_lines;
		for (int i = 1; i <= increasing_lines; i++) {
			for (int j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = decreasing_lines; i > 0; i--) {
			for (int j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
