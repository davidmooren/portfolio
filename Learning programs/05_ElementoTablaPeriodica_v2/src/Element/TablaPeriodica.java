package Element;

public class TablaPeriodica {

	private String Nombre;
	private String Simbolo;
	private int Numero;
	private byte numInstancias = 0;

	public TablaPeriodica() {
		numInstancias++;
	}

	public void setnumInstancias(byte numInstancias) {
		this.numInstancias = numInstancias;
	}

	public byte getnumIntancias() {
		return numInstancias;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getSimbolo() {
		return Simbolo;
	}

	public void setSimbolo(String Simbolo) {
		this.Simbolo = Simbolo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}

	@Override
	public String toString() {
		return "TablaPeriodica [Nombre=" + Nombre + ", Simbolo=" + Simbolo + ", Numero=" + Numero + ", numInstancias="
				+ numInstancias + "]";
	}

}
