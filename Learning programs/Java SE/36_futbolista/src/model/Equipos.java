package model;

public enum Equipos {
	ATLETICO("Atletico de Madrid", "BUENILLO"), MADRID("Real Madrid", "ITWASTHEBEST"), BARSA("Barcelona", "NEWLEGEND");

	private final String nombre;
	private final String valoracion;

	private Equipos(String nombre, String valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getValoracion() {
		return valoracion;
	}

	public String toString() {
		String cad = "[" + this.getNombre() + "-" + this.getValoracion() + "-]";
		return cad;
	}

}
