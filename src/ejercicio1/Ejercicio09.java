package ejercicio1;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		float euro;
		final int peseta = 166;
		float pesetaFin;
		
		//Pedir datos
		
		System.out.println("Introduce la cantidad en €");
		euro = sc.nextFloat();
		
		//Conversor
		pesetaFin = peseta * euro;
		System.out.println( euro +"€ en pesetas son " + pesetaFin + " pesetas.");
		sc.close();
	}

}
