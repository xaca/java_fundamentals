public class MiPrograma{
	public static void main(String args[])
	{
		// Declaración de variables 
		byte numero1;
		int numero2;
		long numero3;
		float numero4;
		double numero5;
		char caracter;
		String cadenas;
		boolean bandera;
		
		//Inicializar o asignación de valores
		numero1 = 1;
		numero2 = 45;
		numero3 = 1234354;
		numero4 = 3.5f;
		numero5 = 6.3;
		caracter = 'a';
		cadenas = "Hola Mundo";
		bandera = true; //false

		//Aritemicos
		numero2 = numero1 + numero2;
		System.out.println(numero2);
		numero1 = 5 - 4;
		System.out.println(numero1);
		numero2 = 6 * 3;
		System.out.println(numero2);
		numero5 = numero1 / numero2;
		System.out.println(numero5);
		numero2 = numero2 % 2;
		System.out.println(numero2);

		//Operadores de relación
		System.out.println(5>6);
		System.out.println(4<7);
		System.out.println(2>=4);
		System.out.println(1<=2);
		System.out.println(3==2);

		//Operadores lógicos
		System.out.println(true&&false);//true si los dos valores true
		System.out.println(true||false);//false si los dos valores son false
		System.out.println(!false);//true

	}
}