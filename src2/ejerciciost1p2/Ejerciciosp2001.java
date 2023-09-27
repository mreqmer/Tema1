package ejerciciost1p2;
import java.util.Scanner;
public class Ejerciciosp2001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		final double MANZANAS_KG = 2.35;
		final double PERAS_KG = 1.95;
		double ventasM;
		double ventasP;
		double beneficioM;
		double beneficioP;
		double beneficioT;
		//Pedir ventas de manzanas
		System.out.println("Introduzca las ventas anuales en Kg de las manzanas:");
		ventasM = sc.nextDouble();
		//Pedir ventas de peras
		System.out.println("Introduzca las ventas anuales en Kg de las peras:");
		ventasP = sc.nextDouble();
		//Cálculos:
		//Beneficio manzanas
		beneficioM = (ventasM * MANZANAS_KG);
		//Beneficio peras
		beneficioP = (ventasP * PERAS_KG);
		//Beneficio total
		beneficioT = beneficioM + beneficioP;
		//Devolver datos al usuario
		System.out.println("Los beneficios de las manzanas son de " + beneficioM + "€");
		System.out.println("Los beneficios de las peras son de " + beneficioP + "€");
		System.out.println("El beneficio total es de " + beneficioT + "€");
		sc.close();

	}

}
