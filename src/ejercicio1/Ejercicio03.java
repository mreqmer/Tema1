package ejercicio1;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner sc = new Scanner(System.in);
		int anoActual; //Año actual dado por el usuario
		int anoNacimiento; //Año de nacimiento del usuario
		int edad; //edad final del usuario que se calcula al final
		//Pedir año actual
		System.out.println("Dígame el año actual para saber el año de nacimiento.");
		anoActual = sc.nextInt();
		//Pedir año de nacimiento
		System.out.println("Dígame su año de nacimiento.");
		anoNacimiento = sc.nextInt();
		//Calcular la edad 
		edad = anoActual - anoNacimiento;
		//Devolver edad del usuario
		System.out.println("Usted tiene " + edad + " años");
		sc.close();

	}

}
