package control;

import beans.MetodosArray;
import utilidades.LecturaDatos;

public class Test {

	public static void Condiciones() {
		System.out.println("Introduce el tama�o de la array");

		int[] can;
		can = MetodosArray.ara(LecturaDatos.leerInt());
		MetodosArray.arra(can);
		MetodosArray.estad(can);

	}
}
