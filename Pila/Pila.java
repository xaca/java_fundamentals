import java.util.Random;


/**
 *  Cada objeto de esta clase gestiona una pila de referencias a objetos de una misma clase.
 *  La pila tiene una capacidad de almacenamiento limitada. Se gestiona de acuerdo con una
 *  política LIFO (Last Input, First Output), es decir, el último dato en ser apilado será
 *  el primero en ser desapilado
 */
public class Pila <C> {
	
   /*
    * La subtabla datos[0..cima] almacena los datos almacenados en esta pila. 
    * datos[0] es el más antiguo de ellos y datos[cima] el más reciente.
    */
   private C[] datos;                // almacenamiento de los datos de esta pila
   private int cima ;                // indice de la cima de esta pila
	
   /**
    * Pre: capacidad>0
    * Post: Esta pila puede almacenar [capacidad] datos, aunque inicialmente
    *       está complatamente vacía 
    */
   public Pila (int capacidad) {
      datos = (C[]) new Object[capacidad];
      cima = -1;
   }
	
   /**
    * Pre: ---
    * Post: Devuelve true si y sólo si esta pila está vacía
    */
   public boolean vacia () {
      return cima == -1;
   }
	
   /**
    * Pre: ---
    * Post: Devuelve true si y sólo si esta pila está llena
    */
   public boolean llena () {
      return cima == datos.length-1;
   }
	
   /**
    * Pre: NOT llena()
    * Post: Almacena [dato] en  esta pila
    */
   public void apilar (C dato) {
      ++cima;
      datos[cima] = dato;
   }
	
   /**
    * Pre: NOT vacia()
    * Post: Devuelve el dato más recientemente apilado en esta pila y lo retira de ella
    */
   public C desapilar () {
      --cima;
      return datos[cima+1];
   }
	

   /**
    * Pre: ---
    * Post: Ilustra el trabajo con pilas de datos. Trabaja en primer lugar con una pila 
    *       de referencias a objetos de la clase Integer y, en segundo lugar, con una
    *       pila de referencias a objetos de la clase String
    */
   public static void main (String[] argumentos) {
      Random generador = new Random();
      /*
       * Define una pila de enteros, apila en ella 10 enteros entre 1 y 1000 generados
       * de forma pseudoaleatoria e informa por pantalla de los datos apilados
       */
      Pila <Integer> pila = new Pila <Integer>(100);
      for (int i=1; i<=10; ++i) {
         int n = new Integer(1+generador.nextInt(1000));
         pila.apilar(n);
         System.out.printf("Apilado: %d%n", n);
      }
      System.out.println();
      /*
       * Desapila los datos de la pila hasta que quede vacía y escribe por pantalla
       * los datos desapilados
       */
      while (!pila.vacia()) {
         int n = pila.desapilar();
         System.out.printf("Desapilado: %d%n", n);
      }
      System.out.println();
      /*
       * Define una pila de String y apila en ella los nombres de varias personas
       */
      Pila <String> pilaNombres = new Pila <String>(20);
      pilaNombres.apilar("María Soledad Arjona");
      pilaNombres.apilar("Ismael García");
      pilaNombres.apilar("David Oliete");
      pilaNombres.apilar("Esperanza de la Vega");
      pilaNombres.apilar("Eugenio Santoro");
      /*
       * Desapila  datos de la pila hasta que quede vacía y escribe por pantalla
       * los nombres desapilados
       */
      while (!pilaNombres.vacia()) {
         System.out.printf("Desapilado: %s%n", pilaNombres.desapilar());
      }
      System.out.println();
   }

}
