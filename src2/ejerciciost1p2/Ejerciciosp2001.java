package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciosp2001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		final double manzanasKg = 2.35;
		final double perasKg = 1.95;
		double ventasM;
		double ventasP;
		double beneficioM;
		double beneficioP;
		double beneficioT;
		//Pedir ventas
		System.out.println("Introduzca las ventas anuales en Kg de las manzanas:");
		ventasM = sc.nextDouble();
		System.out.println("Introduzca las ventas anuales en Kg de las peras:");
		ventasP = sc.nextDouble();
		//Calculo y resultado
		beneficioM = (ventasM * manzanasKg);
		beneficioP = (ventasP * perasKg);
		beneficioT = beneficioM + beneficioP;
		System.out.println("Los beneficios de las manzanas son de " + beneficioM + "€");
		System.out.println("Los beneficios de las peras son de " + beneficioP + "€");
		System.out.println("El beneficio total es de " + beneficioT + "€");
		sc.close();

	}

}
