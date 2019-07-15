package datos;

import modelo.ListaPlatos;
import modelo.MenuDia;
import modelo.Plato;

public class DaoMenuImpl implements DaoMenu {

	@Override
	public MenuDia getMenuDia() {
		String dia = "Martes";

		// Aqui se pedirian los datos mediante JDBC para crear la
		// estructura de platos.
		// Aqui simplificamos y lo hacemos 'a pelo'

		// El dia me vendra dado en algun sitio
		MenuDia menu = new MenuDia(dia);

		ListaPlatos primeros = new ListaPlatos();
		primeros.anadirPlato(new Plato("lentejas"));
		primeros.anadirPlato(new Plato("huevos"));
		primeros.anadirPlato(new Plato("ensalada"));

		ListaPlatos segundos = new ListaPlatos();
		segundos.anadirPlato(new Plato("cachopito"));
		segundos.anadirPlato(new Plato("merluza"));
		segundos.anadirPlato(new Plato("cordero"));

		ListaPlatos postres = new ListaPlatos();
		postres.anadirPlato(new Plato("flan"));
		postres.anadirPlato(new Plato("fruta"));
		postres.anadirPlato(new Plato("helado"));

		menu.annadirListaPlatos(primeros, 0);
		menu.annadirListaPlatos(segundos, 1);
		menu.annadirListaPlatos(postres, 2);

		return menu;
	}

}
