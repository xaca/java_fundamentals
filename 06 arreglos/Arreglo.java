public class Arreglo{
	public static void main(String[] args) {
		
		int arreglo[];
		arreglo = new int[5];

		arreglo[0] = 4;
		arreglo[1] = 34;
		arreglo[2] = 12;
		arreglo[3] = 8;
		arreglo[4] = -2;

		for (int i:arreglo) {
			System.out.println(i);
		}
	}
}