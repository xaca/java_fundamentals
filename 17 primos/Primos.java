public class Primos{

	public static boolean esPrimo(int n)
	{
		int divisores = 2, cont = 2;

		while(cont < n)
		{
			if(n % cont == 0)
			{
				divisores++;
				break;
			}
			cont++;
		}

		return (divisores==2);
	}

	public static void main(String[] args) {
		
		int n = 35, m = 2024;

		for (int i=n;i<=m ;i++ ) {
			
			if(esPrimo(i))
			{
				System.out.println(i);
			}
		}

	}
}