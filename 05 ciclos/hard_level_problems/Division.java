package hard_level_problems;

import java.util.Scanner;

/**
 * EN: Create a programa that shows the numbers of digits of a number
 * ES: Crear un programa que muestre la cantidad de digitos de un numero
 */
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int n = scanner.nextInt();
        int numberOfDigits = 0;
        while (n > 0) {
            n /= 10;
            numberOfDigits++;
        }
        System.out.println("Number of digits: " + numberOfDigits);
    }
}
