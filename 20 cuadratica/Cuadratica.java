public class Cuadratica{

	public static void main(String[] args) {
		double a = 1, b = 6, c=4, temp, x1, x2;
		temp = b*b-4*a*c;

		if(temp>=0)
		{
			if(2*a != 0)
			{
				x1 = -b - Math.sqrt(temp) / (2 * a);
				x2 = -b + Math.sqrt(temp) / (2 * a);
				System.out.println("Las raices son:");
				System.out.println("x1: "+x1);
				System.out.println("x2: "+x2);
			}
			else{
				System.out.println("Error división por cero");
			}
		}
		else
		{
			System.out.println("Error raíz negativa");
		}
	}

}