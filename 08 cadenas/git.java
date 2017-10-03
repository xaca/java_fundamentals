  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;
import java.util.Vector;

/**
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
