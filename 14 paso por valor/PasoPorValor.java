import javax.swing.*;

public class PasoPorValor{

	public static int sumar(int a, int b)
	{
		int c = a + b;
		a = 7;
		b = 2;
		return c;
	}

	public static void imprimir(int num){
		System.out.println(num);
	}
	
	public static void pruebaContexto(){
		int i;
		for (i=0;i<10 ;i++ ) 
		{
			
		}
		System.out.println(i);
	}

	public static int incrementarVariable(int num){
		return num + 1;
	}

	public static void main(String[] args) {
		int a, b, c;
		String entrada;

		try{

			/*entrada = JOptionPane.showInputDialog("Ingrese un dato a");
			a = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Ingrese un dato b");
			b = Integer.parseInt(entrada);
			
			c = sumar(a,b);
			imprimir(a);
			imprimir(b);
			imprimir(c);*/
			a = 0;
			a = incrementarVariable(++a);
			imprimir(a);

		}catch(Exception e){
			System.out.println("Error al leer la dimension");
		}
	}

}