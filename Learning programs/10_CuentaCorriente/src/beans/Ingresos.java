package beans;

import utility.LecturaDatos;

public class Ingresos {

	private int ident;
	private String clien;
	private int nucu;

	public Ingresos() {
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
	public int getnucu() {
		return nucu;
	}

	public void setnucu(int nucu) {
		this.nucu = nucu;
	}

	@Override
	public String toString() {
		return "Ingresos [ident=" + ident + ", clien=" + clien + ", nucu=" + nucu + "]";
	}

	public void Teclado() {
		this.setident(LecturaDatos.ReadInt("Introduce identificador"));
		this.setnucu(LecturaDatos.ReadInt("Introduce la cantidad ingresada"));
		this.setclien(LecturaDatos.ReadString("Introduce el ordenante"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

}