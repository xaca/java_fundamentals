import java.util.Arrays;

public class Referencia{

	public static void cambiarArray(int x[])
	{
		x[0] = 4;
		x[1] = 5;
		x[2] = 6;

	}

	public static void cambiarValor(StringBuilder str){
		str = new StringBuilder();
		str.append("Hola");
	}

	public static void imprimir(StringBuilder str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		int x[] = new int[]{1,2,3};
		StringBuilder str = null;
		imprimir(str);
		cambiarValor(str);
		imprimir(str);

		System.out.println(Arrays.toString(x));
		cambiarArray(x);
		System.out.println(Arrays.toString(x));

	}
}