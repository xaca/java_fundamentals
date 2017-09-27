public class Cadena{
	public static void main(String[] args) {
		
		String str = "hola";

		System.out.println(str.toUpperCase());

		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+"_");
		}
	}
}