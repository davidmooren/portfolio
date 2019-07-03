package beans;

public class Termino {
	private String palabra;
	private String definicion;

	public Termino() {
		super();
	}

	public Termino(String palabra, String definicion) {
		super();
		this.palabra = palabra;
		this.definicion = definicion;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vocablo \n  [palabra=");
		builder.append(palabra);
		builder.append("]\n");
		builder.append("  [Acepción=");
		builder.append(definicion);
		builder.append("]");
		return builder.toString();
	}

}
