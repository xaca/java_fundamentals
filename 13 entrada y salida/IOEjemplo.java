//import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class IOEjemplo{
	public static void main(String[] args) {
		 
		 /*Scanner in = new Scanner(System.in);
    	 System.out.print("Ingrese un dato : ");
    	 String dato = in.nextLine();      
    	 System.out.println("El dato ingresado es : " + dato);*/
		//String str = JOptionPane.showInputDialog(null,"Ingrese un dato");
    	//System.out.println("El dato ingresado es : " + str);


    	//int i[] = {2}; i[8] = 5;             ArrayIndexOutOfBoundsException
    	//String str=null; str.toUpperCase();  NullPointerException
    	// 5/0                                 ArithmethicException

    	String dato;
    	int numero;
    	try{
    		dato = JOptionPane.showInputDialog(null,"Ingrese un valor");
    		System.out.println("dato "+dato);
    		System.out.println(dato.length());
    		numero = Integer.parseInt(dato);
    	}catch(NumberFormatException e){
    		System.out.println("Numero incorrecto");
    	}catch(NullPointerException e){
    		System.out.println("No ingreso nada");
    	}finally{
    		System.out.println("Bien o mal se ejecuta");
    	}

        /*BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
    	System.out.println("El dato ingresado es : " + s);*/
        /*System.out.print("Enter Integer:");
        try{
            int i = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }*/

	}
}