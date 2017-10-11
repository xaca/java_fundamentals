/**
 * Since it was officially released Pomekon in Brazil, Dabriel is trying to realize his biggest dream:
 * Being a Pokemon Master. His goal is to capture the 151 Pomekon available. He managed to capture many monsters,
 * but in his city appear many repeated Pomekons, causing he to capture several times the same Pomekon.
 *
 * Seeing that his bag is pretty full, Dabriel asked you to do a computer program to inform him how many Pomekons are
 * missing to complete the collection.
 *
 * Input
 * The first line of the test case consists of an integer N (1 ≤ N ≤ 10³), representing the amount of Pomekons
 * that Dabriel already captured.
 * The next N lines consists of a string S (1 ≤ |S| ≤ 10³) representing the name of each Pomekon. The name of each
 * Pomekon consists only of uppercase and lowercase letters.
 *
 * Output
 * You should print: "Missing X Pokemons.", where X is the amount Pomekons not captured
 */
package git;

import java.util.Scanner;
import java.util.Vector;

/**
 * A class to return the number of pokemon that are left to capture.
 *
 * @author domiflorzinha
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int qtd, y=0, pok=0;
       String s;
       Scanner ler = new Scanner(System.in);
       Vector<String> v = new Vector();
       qtd = ler.nextInt();
        while(y<qtd){
            y++;
            s = ler.next();
            if (!v.contains(s) && v.size() < 152) v.add(s);
        }
         System.out.print("Missing ");
         System.out.print(151-v.size());
         System.out.print(" Pokemons\n");

    }
    
}
