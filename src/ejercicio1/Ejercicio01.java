package ejercicio1;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short numero;
		
		//Pedir numero
		 
		System.out.println("Dime un número");
		
		//introducir numero
		
		numero = sc.nextShort();
		
		//Devolver numero
		
		System.out.println("Su número es " + numero);
		
		sc.close();
	
	

	}

}
