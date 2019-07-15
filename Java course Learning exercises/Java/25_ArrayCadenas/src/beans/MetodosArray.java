package beans;

public class MetodosArray {

	public static int longCadena(String cadena) {

		// SI la longitud es cero o es nula
		if ((cadena == null) || (cadena.isEmpty())) {
			return 0;
		} else if (cadena.isEmpty()) {
			// SI la longitud es cero
			return 0;

		} else {
			return cadena.length();
		}

	}

}
