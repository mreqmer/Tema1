package ejercicio1;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		//Pedir datos
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad:");
		edad = sc.nextInt();
		//Mensaje
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		sc.close();
	}
	

}
