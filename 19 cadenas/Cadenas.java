public class Cadenas{
	
	public static void main(String[] args) {
		
		String resultado = "", frase = "Nada es tan urgente, nena, nada tan importante, nada merece mas la pena que el instante que tenemos delante - kase o";
		frase = frase.toLowerCase();

		String vector[] = frase.split(" ");

		for(String palabra:vector)
		{
			resultado+= (palabra.charAt(0)+"").toUpperCase();
			resultado+= palabra.substring(1,palabra.length())+" ";
		}
		System.out.println(resultado);
		//anilina, oso, reconocer, arenera, ana, ...
		/*String palabra = "xreconocer";
		String invertida = "";
		for(int i = palabra.length()-1;i>=0;i--)
		{
			invertida+= palabra.charAt(i)+"";
		}

		if(invertida.equals(palabra))
		{
			System.out.println(palabra+" es palindroma ");
		}
		else
		{
			System.out.println(palabra+" no es palindroma ");
		}*/
	}
}