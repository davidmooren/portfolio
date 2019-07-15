package control;

import servicios.Servicios;
import servicios.ServiciosImpl;

public class Control {
	
	private Servicios servicios;
	
	public void arrancar() {
		//¿Funcionara?
		servicios.work();
	};

}
