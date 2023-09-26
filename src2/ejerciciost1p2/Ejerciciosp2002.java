package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciosp2002 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		final int mayoria = 18;
		int edad;
		//Pedir edad
		System.out.println("Introduce tu edad:");
		edad = sc.nextInt();
		//Ver si es mayor de edad y devolver resultado
		String mayor = (edad>=mayoria) ? "Eres mayor de edad." : "Eres menor de edad.";
		System.out.println(mayor);
		sc.close();
	
	
	
	}

}
