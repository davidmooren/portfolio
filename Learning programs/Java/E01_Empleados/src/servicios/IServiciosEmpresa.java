package servicios;

import beans.Director;
import beans.Empleado;

public interface IServiciosEmpresa {

	public void addEmpleado(Empleado p);

	public void addEmpleado();

	public void addDirector(Empleado a);

	public void addDirector();

	public void addGerente(Empleado a);

	public void addGerente();

	public int encontrarEmpleado(Empleado e);

	public void eliminarEmpleado();

	public void eliminarEmpleado(Empleado e);

	public boolean existeEmpleado();

	public boolean existeEmpleado(Empleado e);

	public void modificarEmpleado();

	public void modificarEmpleado(Empleado e);

	public void CasosDePrueba();

	public void listado();

	public void listado(Empleado e);

}
