
/*
 * Descripcion del problema:
 * https://es.wikipedia.org/wiki/Torres_de_Hanói
 * 
 * */
public class TorresHanoi {
	
	public static void resolver(int numeroDeDiscos, String posicionInicial, String auxiliar, String posicionFinal) {
		/*
			Caso base es tener un solo disco para mover
			en este caso el disco puede moverse directamente a la posición final
			dado que el resto está en la torre auxiliar.
		*/ 
		if( numeroDeDiscos == 1){
			System.out.println(posicionInicial + " -> " + posicionFinal);
		}else{
			
			/*
			  En esta parte se mueven los discos que están arriba del disco n (el que está mas abajo y el más grande).
			  Movemos todos estos discos (son n-1 discos) a la torre auxiliar usando la torre final como auxiliar.			  
			  */
			
			resolver(numeroDeDiscos - 1, posicionInicial, posicionFinal, auxiliar);
			
			/*
			  Cuando se mueven los n-1 discos que estan arriba del disco más grande, se puede mover el disco más grande a
			  la posicion final.
			  */
			
			System.out.println(posicionInicial + " -> " + posicionFinal);
			
			/*
			  Luego tenemos que mover los n-1 discos que estan en la torre auxiliar a la torre final
			  */
			
			resolver(numeroDeDiscos - 1, auxiliar, posicionInicial, posicionFinal);
		}
	}

	public static void main(String[] args) {
		
		int numeroDeDiscos = 3;
		//Queremos mover todos los discos de la torre A a la torre C y usar la torre B como auxiliar.
		resolver(numeroDeDiscos, "A", "B", "C");
		
	}

}
