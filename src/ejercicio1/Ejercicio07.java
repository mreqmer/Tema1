package ejercicio1;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre;
		String direccion;
		int telefono;
		
		//Pedir datos
		System.out.println("Intoduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Intoduce tu dirección:");
		direccion = sc.nextLine();
		System.out.println("Intoduce tu teléfono:");
		telefono = sc.nextInt();
		//Devolver datos
		System.out.println("Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono);
		sc.close();
	}

}
