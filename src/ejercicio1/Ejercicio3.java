package ejercicio1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner sc = new Scanner(System.in);
		int anoActual;
		int anoNacimiento;
		int edad;
		//Pedir edad de usuario
		System.out.println("Dígame el año actual para saber el año de nacimiento.");
		anoActual = sc.nextInt();
		System.out.println("Dígame su año de nacimiento.");
		anoNacimiento = sc.nextInt();
		
		//Devolver año de nacimiento
		edad = anoActual - anoNacimiento;
		System.out.println("Usted tiene " + edad + " años");
		sc.close();

	}

}
