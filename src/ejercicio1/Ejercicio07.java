package ejercicio1;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre; //Variable con el nombre del usuario
		String direccion; //Variable con la direccion del usuario
		int telefono; //Variable on el número de teléfono 
		//Pedir datos
		//Nombre
		System.out.println("Intoduce tu nombre:");
		nombre = sc.nextLine();
		//Dirección
		System.out.println("Intoduce tu dirección:");
		direccion = sc.nextLine();
		//Teléfono
		System.out.println("Intoduce tu teléfono:");
		telefono = sc.nextInt();
		//Devolver datos
		System.out.println("Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono);
		sc.close();
	}

}
