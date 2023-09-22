package ejercicio1;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner sc = new Scanner(System.in);
		int nota1;
		int nota2;
		double media;
		
		//Pedir notas
		System.out.println("Introduce tus dos notas:");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		
		//Calcular media y devolver resultado
		media = (nota1 + nota2) / 2; 
		System.out.println("Su media aritmetica es " + media);
		
		sc.close();

	}

}
