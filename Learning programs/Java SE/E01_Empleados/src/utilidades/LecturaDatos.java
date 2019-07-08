package utilidades;

import java.util.Scanner;

public class LecturaDatos {

	// Lector enteros

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}

	// Lector texto
	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}

	public static String leerString(String msg) {
		System.out.println(msg);
		return leerString();
	}

	public static boolean leerBoolean() {
		return new Scanner(System.in).nextBoolean();
	}

	public static boolean leerBoolean(String msg) {
		System.out.println(msg);
		return leerBoolean();
	}

	public static float leerFloat() {
		return new Scanner(System.in).nextFloat();
	}

	public static float leerFloat(String mensaje) {
		System.out.println(mensaje);
		return leerFloat();
	}

	public static double leerDouble() {
		return new Scanner(System.in).nextDouble();
	}

	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}

}
