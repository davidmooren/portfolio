package model;

public enum Posicion {

	DELANTERO, DEFENSA, PORTERO, MEDIO;

	public String toString() {
		String cad = "[" + this.name().toLowerCase() + "]";
		return cad;
	}

}
