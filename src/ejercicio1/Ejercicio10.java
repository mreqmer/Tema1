package ejercicio1;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		final int iva = 21;
		float precio;
		float precioFin;
		//Pedir datos
		System.out.println("Introduce la cantidad en €");
		precio = sc.nextFloat();
		//Devolver el precio con iva
		precioFin = ((precio * iva) / 100) + precio;
		System.out.println("El precio con IVA son " + precioFin + "€");
		sc.close();
	}

}
