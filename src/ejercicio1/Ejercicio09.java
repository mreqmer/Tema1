package ejercicio1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		float euro; // dinero dado por el usuario
		final int PESETA = 166; // constante para el cálculo de la conversión peseta-euro
		float pesetaFin; // dinero en pesetas despues de convertir los euros en pesetas

		// Pedir datos
		System.out.println("Introduce la cantidad en €");
		euro = sc.nextFloat();
		// Cálculo del conversor
		pesetaFin = PESETA * euro;
		// Devolver datos de la conversión al usuario
		System.out.println(euro + "€ en pesetas son " + pesetaFin + " pesetas.");
		sc.close();
	}

}
