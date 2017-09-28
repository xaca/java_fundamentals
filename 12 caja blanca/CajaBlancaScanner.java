import java.util.Scanner;

public class CajaBlancaScanner{
	public static void calcularPromedio(double datos[])
	{
	   double ans = 0;
	   if(datos.length > 0)
	   { 
	     for(double numero:datos)
	     {
	        ans+= numero;
	     } 
	     ans = ans/datos.length;
	     System.out.println("El promedio es "+ans);
	   }
	   else
	   {
	     System.out.println("No hay números");
	   }
	}

	public static long factorial(long n){
		if(n>0){
			return factorial(n-1)*n;
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfValues = sc.nextInt();
		double[] data= new double[numberOfValues];
		for(int i=0;i<numberOfValues;i++){
			data[i]=sc.nextDouble();
		}
		calcularPromedio(data);
		System.out.println(factorial(14));
	}
}
