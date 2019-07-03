package control;

import java.util.ArrayList;
import java.util.List;

import model.Equipos;
import model.Futbolista;
import model.Posicion;

public class Test {
	public void test01() {

		List<Futbolista> lista = new ArrayList<>();

		lista.add(new Futbolista("Keylor", Equipos.MADRID, Posicion.PORTERO));
		lista.add(new Futbolista("Messi", Equipos.BARSA, Posicion.DELANTERO));
		lista.add(new Futbolista("Griezmann", Equipos.ATLETICO, Posicion.DELANTERO));

		for (Futbolista f : lista) {
			System.out.println(f);
		}
		for (Futbolista f : lista) {
			if (f.getEquipo().getNombre().equals("Real Madrid")) {
				System.out.println(f.getEquipo());
			}
		}

	}

}
