import java.util.Scanner;
class Oprations{
	int [][]matrix1;
	int [][]matrix2;
	Oprations(){
		this.matrix1 = new int[3][3];
		this.matrix2 = new int[3][3];
	}
	void getMatrixElement(){
		Scanner scanner =  new Scanner(System.in);
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				matrix1[row][column] =  scanner.nextInt();
			}
		}
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				matrix2[row][column] =  scanner.nextInt();
			}
		}
	}
	void matrixAddition(){
		int [][]addMatrix = new int[3][3];
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Addition of two Matrix is");
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				addMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
				System.out.print(addMatrix[row][column]+"  ");
			}
			System.out.println();
		}
	}
	void matrixSubtraction(){
		int [][]subMatrix = new int[3][3];
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Subratction of two Matrix is");
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				subMatrix[row][column] = matrix1[row][column] - matrix2[row][column];
				System.out.print(subMatrix[row][column]+"  ");
			}
			System.out.println();
		}
	}
	void matrixTranspose(){
		int [][]transposeMatrix1 = new int[3][3];
		int [][]transposeMatrix2 = new int[3][3];
		System.out.println();
		System.out.println("----------------------");
		System.out.println("First Matrix Transpose");
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				transposeMatrix1[row][column] = matrix1[column][row];
				transposeMatrix2[row][column] = matrix2[column][row];
				System.out.print(transposeMatrix1[row][column]+"    ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("Second matrix Transpose");
		for (int row = 0; row < 3; row++){
			for (int column = 0;column < 3 ; column++) {
				transposeMatrix2[row][column] = matrix2[column][row];
				System.out.print(transposeMatrix2[row][column]+"    ");
			}
			System.out.println();
		}
	}
}
class Matrix{
	public static void main(String[] args) {
		Oprations obj = new Oprations();
		obj.getMatrixElement();
		obj.matrixAddition();
		obj.matrixSubtraction();
		obj.matrixTranspose();
	}
}