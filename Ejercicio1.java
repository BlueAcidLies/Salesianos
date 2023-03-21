package tarea6;

import java.util.Scanner;

/**
 *Implementa un programa Java que le solicite al usuario un número entero
 *positivo y escriba dicho número con letra por pantalla. Únicamente debe
 *mostrar los nombres de los números del 0 al 9, el resto los mostrará con
 *el nombre “Otros”.
 */
public class Ejercicio1 {
/**
 * Pre:---
 * Post:
 */
	public static String nomNumero (int n) {
		if (n == 0) {
			return "Cero";
		} else if (n == 1) {
			return "Uno";
		} else if (n == 2) {
			return "Dos";
		} else if (n == 3) {
			return "Tres";
		} else if (n == 4) {
			return "Cuatro";
		} else if (n == 5) {
			return "Cinco";
		} else if (n == 6) {
			return "Seis";
		} else if (n == 7) {
			return "Siete";
		} else if (n == 8) {
			return "Ocho";
		} else if (n == 9) {
			return "Nueve";
		} else {
			return "Otro";
		}
	}
/**
 * Pre:---
 * Post:
 */
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame un número: ");
		int n = entrada.nextInt();
		System.out.println(nomNumero(n));
	}
}
