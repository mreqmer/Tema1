package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciotp2003 {
	
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int numero;
		//pedir numero
		System.out.println("Introduce un número entero:");
		numero = sc.nextInt();
		//Calcular si es par o no y devolverlo
		String parImpar = (numero%2==0) ? "Número par." : "Número impar.";
		System.out.println(parImpar);
		sc.close();
	}

}