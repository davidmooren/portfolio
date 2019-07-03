package lectura;

import java.util.Scanner;

public class Lectura {

	public static int ReadInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int ReadInt(String msg) {
		System.out.println(msg);
		return Lectura.ReadInt();
	}

	public static String ReadString() {
		return new Scanner(System.in).nextLine();
	}

	public static String ReadString(String msg) {
		System.out.println(msg);
		return Lectura.ReadString();
	}

}
