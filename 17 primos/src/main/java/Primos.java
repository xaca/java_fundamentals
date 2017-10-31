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
}