package tarea4Apartado4;

/* @Author Pablo Bernal Vilana
 * Declaracion de una variable entera N y asignacion de un valor. 
 * Incrementar N en 77.
 * Decrementarla en 3.
 * Duplicar su valor. 
 */
public class MainApp {

	public static void main(String[] args) {
		// Declaracion variable entera N y asignacion de un valor
		int N = 1;
		System.out.println("Valor inicial de N = " + N);
		// Incremento de N en 77
		System.out.println("N + 77" + " = " + (N = N + 77));
		// Decremento de N en 3
		System.out.println("N - 33" + " = " + (N = N - 3));
		// Duplicar valor de N
		System.out.println("N * 2" + " = " + (N = N * 2));
	}
}
