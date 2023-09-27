package ejercicio1;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre; //Nombre dado por el usuario
		int edad; //edad dada por el usuario
		//Pedir datos
		//Nombre
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		//Edad
		System.out.println("Introduce tu edad:");
		edad = sc.nextInt();
		//Mensaje al usuario
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		sc.close();
	}
	

}
