package modelo;

import java.io.Serializable;

/**
 *
 * @author Antonio Santos
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;	
	private String habitacion;

	public Usuario() {
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", habitacion=" + habitacion + "]";
	}
	
}
