package beans;

import utility.LecturaDatos;

public class CuentaCorriente {

	private int ident;
	private String clien;
	private int CanDe;

	public CuentaCorriente() {
		super();
	}

	// SG1

	public int getident() {
		return ident;
	}

	public void setident(int ident) {
		this.ident = ident;
	}

	// SG2
	public String getclien() {
		return clien;
	}

	public void setclien(String clien) {
		this.clien = clien;
	}

	// SG3
	public int getCanDe() {
		return CanDe;
	}

	public void setCanDe(int CanDe) {
		this.CanDe = CanDe;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [ident=" + ident + ", clien=" + clien + ", CanDe=" + CanDe + "]";
	}

	public void Teclado() {
		this.setident(LecturaDatos.ReadInt("Introduce Ident:"));
		this.setclien(LecturaDatos.ReadString("Introduce cliente"));
		this.setCanDe(LecturaDatos.ReadInt("Introduce la cantidad a depositar"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

}
