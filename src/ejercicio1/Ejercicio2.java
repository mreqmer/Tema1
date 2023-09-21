package ejercicio1;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaracion de variables
		 Scanner sc = new Scanner(System.in);
		 short edad;
		 short edadProxima;
		 
		//Pedir edad
		System.out.println("Dime tu edad.");
		//Recoger la edad del usuario
		edad = sc.nextShort();
		//Devolver edad y un año mas
		edadProxima = ++edad;
		System.out.println("Usted tendrá " + edadProxima + " años el próximo año.");
		sc.close();
	}

}
