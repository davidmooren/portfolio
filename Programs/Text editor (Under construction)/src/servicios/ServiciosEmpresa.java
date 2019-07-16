package servicios;

import datos.DatosEmpresa;
import datos.IDatosEmpresa;
import beans.Director;
import beans.Empleado;
//import beans.EmpleadoMaker;

public class ServiciosEmpresa implements IServiciosEmpresa {
	
	private IDatosEmpresa datos = new DatosEmpresa();
	
	public void addEmpleado(Empleado p) {
		datos.addEmpleado(p);
	}

	public void addEmpleado() {
		// Opcion 01
		datos.addEmpleado();

		// Opcion 02
		// datos.addEmpleado(new Empleado());

		// opcion 03 <-- la mas correcta
		// datos.addEmpleado(EmpleadoMaker.dameEmpleado());
	}
	
	public void addDirector(Empleado a) {
		datos.addDirector(a);
	}
	
	
	public void addDirector() {
		datos.addDirector();
	}
	
	
	
	
	public void addGerente(Empleado a) {
		datos.addGerente(a);
	}
	
	
	public void addGerente() {
		datos.addGerente();
	}
	
	
	
	
	
	

	public void listado(Empleado e) {
		datos.listado(e);
	}
	
	public void listado() {
		datos.listado();
	}
	
	

	@Override
	public int encontrarEmpleado(Empleado e) {
		return datos.encontrarEmpleado(e);
	}

	@Override
	public void eliminarEmpleado() {
		datos.eliminarEmpleado();
	}

	@Override
	public void eliminarEmpleado(Empleado e) {
		datos.eliminarEmpleado(e);
	}

	@Override
	public boolean existeEmpleado() {
		return datos.existeEmpleado();
	}

	@Override
	public boolean existeEmpleado(Empleado e) {
		return datos.existeEmpleado(e);
	}

	@Override
	public void modificarEmpleado() {
		datos.modificarEmpleado();
	}

	@Override
	public void modificarEmpleado(Empleado e) {
		datos.modificarEmpleado(e);
	}

	public void CasosDePrueba() {
		datos.CasosDePrueba();
	}



}
