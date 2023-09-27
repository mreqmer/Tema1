package ejercicio1;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		final int IVA = 21; //iva constante para el posterior cálculo
		float precio; //precio que se usará para el posterior cálculo del iva
		float precioFin; //aquí se guarda el precio con el iva ya calculado
		//Pedir el dinero en eruos para su posterior cálculo
		System.out.println("Introduce la cantidad en €");
		precio = sc.nextFloat();
		//Cálculo de iva
		precioFin = ((precio * IVA) / 100) + precio;
		//Devolver precio cn iva al usuario
		System.out.println("El precio con IVA son " + precioFin + "€");
		sc.close();
	}

}
