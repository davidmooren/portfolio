package model;

public class Futbolista {

	private String nombre;
	private Equipos equipo;
	private Posicion posicion;

	public Futbolista() {
		super();
	}

	public Futbolista(String nombre, Equipos equipo, Posicion posicion) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", equipo=" + equipo + ", posicion=" + posicion + "]";
	}

}
