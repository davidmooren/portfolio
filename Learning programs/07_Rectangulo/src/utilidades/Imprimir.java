package utilidades;

import java.util.Scanner;

public class Imprimir {

	public static int ReadInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int ReadInt(String msg) {
		System.out.println(msg);
		return Imprimir.ReadInt();
	}

}
