package servicios;

import datos.Datos;
import datos.DatosImpl;

public class ServiciosImpl implements Servicios {
	
	private Datos datos;

	@Override
	public void work() {
		datos.work();
		
	}

}
