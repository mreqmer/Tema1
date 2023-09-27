package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciosp2005 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		double notaT1 , notaT2 , notaT3;
		double notaCalculo;
		//Pedir notas al usuario
		System.out.println("Introduce la nota del primer trimestre:");
		notaT1 = sc.nextDouble();
		System.out.println("Introduce la nota del segundo trimestre:");
		notaT2 = sc.nextDouble();
		System.out.println("Introduce la nota del tercer trimestre:");
		notaT3 = sc.nextDouble();
		//Calcular notas	
	    notaCalculo =  (notaT1 + notaT2 + notaT3)/3;
	    //Devolver la nota media al usuario
	    int notaMedia = (int) notaCalculo;
	    System.out.println("Su nota media es de " + notaMedia + ".");
	    sc.close();
	}

}
