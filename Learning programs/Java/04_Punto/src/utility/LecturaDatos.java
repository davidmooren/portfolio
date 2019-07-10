package utility;

import java.util.Scanner;

public class LecturaDatos {

	public static int ReadInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int ReadInt(String msg) {
		System.out.println(msg);
		return LecturaDatos.ReadInt();
	}

}
