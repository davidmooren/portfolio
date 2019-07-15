package model;

/*
 * @autor: Antonio
 */

public class Cerveza {

	private String nombre;
	private byte graduacion;
	private String tipo;

	public Cerveza() {

	}

	public Cerveza(String nombre, byte graduacion, String tipo) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(byte graduacion) {
		this.graduacion = graduacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cerveza [nombre=" + nombre + ", graduacion=" + graduacion + ", tipo=" + tipo + "]";
	}

}
