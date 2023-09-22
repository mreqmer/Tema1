package ejercicio1;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		int resta;
		int suma;
		int division;
		int multiplicacion;
		//Pedir números
		System.out.println("Introduce dos números: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		//Calculo
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		division = numero1 / numero2;
		multiplicacion = numero1 * numero2;
		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nDivisión: " + division + "\nMultiplicación: " + multiplicacion);
		sc.close();
		
	}

}
