public class Matriz{
	public static void main(String[] args) {
		
		double matriz[][];//Declaración
		matriz = new double[3][5];

		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		matriz[0][3] = 1;
		matriz[0][4] = 1;

		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		matriz[1][3] = 2;
		matriz[1][4] = 2;

		matriz[2][0] = 3;
		matriz[2][1] = 3;
		matriz[2][2] = 3;
		matriz[2][3] = 3;
		matriz[2][4] = 3;

		for (int i=0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length ; j++ ) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}
}