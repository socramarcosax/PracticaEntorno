package practicaEntornoJ.A.F;

import java.util.Scanner;

public class Leer {
	static Scanner lector = new Scanner(System.in);

	public static int entero() {
		int retorno = lector.nextInt();
		return retorno;
	}
	
	public static double decimal() {
		double retorno = lector.nextInt();
		return retorno;
	}

	public static char letra() {
		char retorno = lector.nextLine().toLowerCase().charAt(0);
		return retorno;
	}

	public static String cadena() {
		String retorno = lector.nextLine();
		return retorno;
	}
}
