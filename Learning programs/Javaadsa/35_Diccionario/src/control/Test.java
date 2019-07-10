package control;

import beans.Termino;
import utilidades.LecturaDatos;

public class Test {

	public static void Prueba01() {
		Termino t1 = new Termino("casa", "edificio para habitar");
		Termino t2 = new Termino("familia", "grupo de personas emparentadas entre sí");
		Termino t3 = new Termino("consejo", "opinión expresada para orientar");
		Termino t4 = new Termino("loco", "que ha perdido la razón");
		Termino[] lista = new Termino[4];
		lista[0] = t1;
		lista[1] = t2;
		lista[2] = t3;
		lista[3] = t4;

		for (Termino t : lista) {
			System.out.println(t);
			System.out.println("Num de letras: " + LecturaDatos.numLetrasEnPalabra(t.getPalabra()));
			System.out.println("Num de palabras: " + LecturaDatos.numPalabrasEnTexto(t.getDefinicion()));
		}
	}
}
