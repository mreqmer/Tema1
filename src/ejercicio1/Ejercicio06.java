package ejercicio1;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		int numero1; //primer número para los cálculos
		int numero2; //Segundo número para los cálculos
		int resta; //Se guardará el calculo de la resta
		int suma; //Se guardará el calculo de la suma
		int division; //Se guardará el calculo de la división
		int multiplicacion; //Se guardará el calculo de la multiplicación
		//Pedir dos números para las operaciones
		System.out.println("Introduce dos números: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		//Calculos:
		//Suma
		suma = numero1 + numero2;
		//Resta
		resta = numero1 - numero2;
		//División
		division = numero1 / numero2;
		//Multiplicación
		multiplicacion = numero1 * numero2;
		//Devolcer operaciones al usuario
		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nDivisión: " + division + "\nMultiplicación: " + multiplicacion);
		sc.close();
		
	}

}
