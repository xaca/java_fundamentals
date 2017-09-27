public class CajaBlanca{
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
		//calcularPromedio(new double[]{3,4,5,6,7,8});
		System.out.println(factorial(14));
	}
}