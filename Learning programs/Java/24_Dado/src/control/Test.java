package control;

import beans.MetodosArray;
import utilidades.LecturaDatos;

public class Test {

	public static void Condiciones() {
		System.out.println("Teclea un numero para empezar a introducir los numeros del dado");

		int[] can;
		can = MetodosArray.ara(LecturaDatos.leerInt());
		MetodosArray.arra(can);

		MetodosArray.saveAllFrecuency(can);

	}
}
