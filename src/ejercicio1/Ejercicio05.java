package ejercicio1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		double radio; //radio dado por el usuario para los cálculos
		double area; //área que se calculará posteriormente
		double longitud; //longitud que se calculará posteriormente
		double pi = Math.PI;
		//Pedir radio para el cálculo
		System.out.println("Introduce el radio de la circunferencia:");
		radio = sc.nextDouble();
		//Cálculo de longitud
		longitud = 2 * pi * radio;
		//Cálculo del área
		area = pi * Math.pow(radio, 2); 
		//Devolver resultado de la longitud y el área para el usuario
		System.out.println("La longitud es de " + longitud + "\nEl área es de " + area);
		sc.close();

	}

}
