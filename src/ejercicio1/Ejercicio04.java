package ejercicio1;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner sc = new Scanner(System.in);
		int nota1; //Primera nota dada por el usuario
		int nota2; //segunda nota dada por el usuario
		double media; //se guarda el posterior cálculo de la nota media del usuario
		//Pedir dos notas para la media
		System.out.println("Introduce tus dos notas:");
		//Primera nota del usuario
		nota1 = sc.nextInt(); 
		//Segunda nota del usuario
		nota2 = sc.nextInt();	
		//Calcular media
		media = (nota1 + nota2) / 2; 
		//Devolver resultado
		System.out.println("Su media aritmetica es " + media);
		
		sc.close();

	}

}
