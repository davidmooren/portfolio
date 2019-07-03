package beans;

import utilidades.LecturaDatos;

public class MetodosArray {

	public static int[] ara(int can) {

		System.out.println("Array de " + can);

		/*
		 * array y return dentro de las llaves del metodo
		 */

		int[] nu = new int[can];

		return arra(nu);

	}

	/*---Empieza metodo Nuevo---
	 * 
	 * 
	 * METODO PARA IMPRIMIMIR INSTRUCCIONES 
	 * y proporcionar tamaño a la array
	 */

	public static int[] arra(int[] ra) {

		int totaArray = ra.length;

		for (int i = 0; i < totaArray; i++) {

			System.out.print("\nDame numero " + (i + 1) + " de " + totaArray + " --> ");
			ra[i] = LecturaDatos.leerInt();

		}

		return ra;

	}

}
