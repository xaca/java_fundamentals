import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CajaBlancaBufferedReader{
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

	public static void main(String[] args) throws IOException	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfValues = Integer.parseInt(br.readLine());
		double[] data= new double[numberOfValues];
		for(int i=0;i<numberOfValues;i++){
			data[i]=Double.parseDouble(br.readLine());
		}
		calcularPromedio(data);
		System.out.println(factorial(14));
	}
}
