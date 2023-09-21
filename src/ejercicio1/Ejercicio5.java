package ejercicio1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		double radio;
		double area;
		double longitud;
		double pi = Math.PI;
		//Pedir radio para el calculo
		System.out.println("Introduce el radio de la circunferencia:");
		radio = sc.nextDouble();
	
		//Calculo de area y longitud
		longitud = 2 * pi * radio;
		area = pi * Math.pow(radio, 2); 
		System.out.println("La longitud es de " + longitud + "\nEl área es de " + area);
		sc.close();

	}

}
