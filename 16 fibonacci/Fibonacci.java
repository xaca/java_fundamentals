public class Fibonacci{

	public static void calcularNumeros(int n)
	{
		
		int a = 0, b = 1, c = 0;

		do{
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}while(--n>0);
		System.out.println("");
	}

	public static void main(String[] args) {
		
		calcularNumeros(9);
		calcularNumeros(12);

	}
}