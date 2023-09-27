package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciotp2004 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		
		boolean lluvia;
		boolean deberes;
		boolean biblioteca;
		//Pedir datos
		System.out.println("¿Está lloviendo?");
		lluvia = sc.nextBoolean();
		System.out.println("¿Has terminado los deberes?");
		deberes = sc.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		//Ternario para ver si cumple la codición
		String calle = (biblioteca||(!lluvia&&deberes)) ? "Puedes salir a la calle." : "No puedes salir a la calle";
		System.out.println(calle);
		sc.close();
		
	}

}
