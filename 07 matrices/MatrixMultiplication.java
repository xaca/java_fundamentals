import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows of the first matrix: ");
		int m = sc.nextInt();

		System.out.print("Enter the number of columns of the first matrix: ");
		int n = sc.nextInt();

		int A[][] = new int[m][n];

		System.out.println("Enter the elements of the first matrix, row by row:");

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("The second matrix must have " + n + " rows.");
		System.out.print("Enter the number of columns of the second matrix: ");
		int p = sc.nextInt();

		System.out.println("Enter the elements of the second matrix, row by row:");

		int B[][] = new int[n][p];

		for(int i=0; i<n; i++) {
			for(int j=0; j<p; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		int[][] C = matrixMultiplication(A, B);

		System.out.println("The result is:");

		for(int i=0; i<m; i++) {
			for(int j=0; j<p; j++) {
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
	
	/*
	 * Calculates the product of two matrices.
	 * The number of rows of the second matrix must be the same as the number of columns of the first matrix.
	 * If A is an m*n matrix, and B is an n*p matrix, their product C=AB is an m*p matrix.
	 */
	private static int[][] matrixMultiplication(int[][] A, int[][] B) {
		int m = A.length;
		int n = A[0].length;
		int p = B[0].length;

		int[][] C = new int[m][p];

		for(int i=0; i<m; i++) {
			for(int j=0; j<p; j++) {
				int current = 0;
				for(int k=0; k<n; k++) {
					current += A[i][k]*B[k][j];
				}
				C[i][j] = current;
			}
		}

		return C;
	}

}
