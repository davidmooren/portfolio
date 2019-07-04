package beans;

import utility.LecturaDatos;

public class Asignaturas {

	private String as1;
	private String as2;

	public Asignaturas() {
		super();
	}

	public String getas1() {
		return as1;
	}

	public void setas1(String as1) {
		this.as1 = as1;
	}

	public String getas2() {
		return as2;
	}

	public void setas2(String as2) {
		this.as2 = as2;
	}

	@Override
	public String toString() {
		return "Asignaturas [as1=" + as1 + ", as2=" + as2 + "]";
	}

	public String toString2() {
		return "Asignaturas [as1=" + as1 + ", as2=" + as2 + "]";
	}

	public void Teclado() {
		this.setas1(LecturaDatos.ReadString("Introduce asignatura1"));
		this.setas2(LecturaDatos.ReadString("Introduce asignatura2"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

	public void imprimeInforme2() {
		System.out.println(this.toString2());

	}

}
