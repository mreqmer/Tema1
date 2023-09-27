package ejercicio1;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		//Declaracion de variables
		 Scanner sc = new Scanner(System.in);
		 short edad; //Recoge la edad del usuario
		 short edadProxima;//Sirve para el posterior cálculo de la edad del próximo año
		//Pedir edad
		System.out.println("Dime tu edad.");
		//Recoger la edad del usuario
		edad = sc.nextShort();
		//Calculo edad el año próximo
		edadProxima = ++edad;
		//Devolver edad y un número más
		System.out.println("Usted tendrá " + edadProxima + " años el próximo año.");
		sc.close();
	}

}
