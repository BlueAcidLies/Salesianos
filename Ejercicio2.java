package tarea6;
/**
 *Escribe un programa Java que muestre los números del 1 al 110, con 11
 *números por línea. El programa deberá escribir por pantalla “Coza” en
 *lugar de los números múltiplos de 3, “Loza” en lugar de los números
 *múltiplos de 5, “Woza” en lugar de los números múltiplos de 7 y
 *“CozaLoza” en lugar de los números múltiplos de 3 y 5. El resultado debe
 *ser similar al siguiente:
 *1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
 *Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
 *23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
 *......
 */
public class Ejercicio2 {
/**
 * Pre:---
 * Post:
 */
	public static void cozaLoza() {
		String multiploTres = "Coza";
		String multiploCinco = "Loza";
		String multiploSiete = "Woza";
		String multiploTresyCinco = "CozaLoza";
		int contadorLinea = 0;
		for (int i = 1; 1 <= 110; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(multiploTresyCinco + " ");
			} else if (i % 3 == 0) {
				System.out.print(multiploTres + " ");
			} else if (i % 5 == 0) {
				System.out.print(multiploCinco + " ");
			} else if (i % 7 == 0) {
				System.out.print(multiploSiete + " ");
			} else {
				System.out.print(i + " ");
			}
			contadorLinea++;
			if(contadorLinea == 11) {
				System.out.print("\n");
				contadorLinea = 0;
			}
		}
	}
/**
 * Pre:---
 * Post:
 */
	public static void main (String[] args) {
		cozaLoza();
	}
}
