package beans;

import utilidades.LecturaDatos;

public class MetodosArray {

	public static int[] ara(int can) {

		System.out.println("Array de " + can);

		/*
		 * array y return dentro de las llaves del metodo
		 */

		int[] nu = new int[can];

		return nu;

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

		return sumaa(ra);

	}

	// En esta versión se imprime cada valor y se suma con el anterior
	public static int[] sumaa(int[] aca) {

		int sum = 0;
		for (int i = 0; i < aca.length; i++) {
			sum += aca[i];
			System.out.println("El total del valor" + " " + i + " " + "es" + " " + sum);
		}

		return inver(aca);

	}

	public static int[] inver(int[] can) {
		int[] aux = new int[can.length];
		int i = 0;
		for (int j = can.length - 1; j >= 0; j--) {

			aux[i++] = can[j];
			System.out.println("Los valores introducidos de forma invertida son:" + " " + can[j]);
		}
		return null;
	}

	// Para imprimir los datos estadisticos

	public static void estad(int[] can) {
		int maximo, minimo;
		double suma;
		if (can.length == 0) {
			System.out.println("Este array no tiene datos");
		} else {
			maximo = can[0];
			minimo = maximo;
			suma = 0.0;
			for (int num : can) {
				if (num > maximo) {
					maximo = num;
				}
				if (num < minimo) {
					minimo = num;
				}
				suma += num;
			}
			System.out.println("Máximo: " + maximo);
			System.out.println("Mínimo: " + minimo);
			System.out.println("Media aritmética: " + suma / can.length);

		}
	}
}
