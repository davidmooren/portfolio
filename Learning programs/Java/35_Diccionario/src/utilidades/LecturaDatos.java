package utilidades;

import java.util.Scanner;

public class LecturaDatos {

	// Lector enteros

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int leerInt(String msg) {
		System.out.println(msg);
		return LecturaDatos.leerInt();
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

	public static int numPalabrasEnTexto(String texto) {

		// https://es.stackoverflow.com/questions/14599/c%C3%B3mo-contar-las-palabras-que-hay-en-un-texto-en-java
		int cantidad = 0;
		cantidad = texto.split("\\s+|\n").length;

		return cantidad;

	}

	public static int numLetrasEnPalabra(String palabra) {
		return palabra.length();
	}

}
