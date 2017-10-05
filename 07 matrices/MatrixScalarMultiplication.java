import java.util.Scanner;

public class MatrixScalarMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int m = sc.nextInt();

		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();

		int A[][] = new int[m][n];

		System.out.println("Enter the elements of the matrix, row by row:");

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the scalar: ");
		int k = sc.nextInt();

		int[][] B = scalarMultiplication(A, k);

		System.out.println("The result is:");

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(B[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
	
	/*
	 * Calculates the product of a matrix by a scalar
	 */
	public static int[][] scalarMultiplication(int[][] A, int k) {
		int m = A.length;
		int n = A[0].length;

		int[][] B = new int[m][n];

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				B[i][j] = k * A[i][j];
			}
		}

		return B;
	}

}
