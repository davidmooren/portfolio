package employee;

import empresa.Imprimir;

public class Departamentos {

	private String Nombre;

	private String Ubicacion;

	private int Telefono;

	public Departamentos() {
		super();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String Ubicacion) {
		this.Ubicacion = Ubicacion;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int Telefono) {
		this.Telefono = Telefono;
	}

	@Override
	public String toString() {
		return "Departamentos [Nombre=" + Nombre + ", Ubicacion=" + Ubicacion + ", Telefono=" + Telefono + "]";
	}

	public void Depar() {
		System.out.println("Introduce Datos");
		System.out.println(Imprimir.ReadString("Nombre " + Nombre));
		System.out.println(Imprimir.ReadString("Ubicacion " + Ubicacion));
		System.out.println(Imprimir.ReadInt("Telefono" + Telefono));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

}
