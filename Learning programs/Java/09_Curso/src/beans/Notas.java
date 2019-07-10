package beans;

import utility.LecturaDatos;

public class Notas {

	private int x;
	private int y;

	public Notas() {
		super();
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return x;
	}

	public void sety(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Nota1 [Asignatura 1=" + x + ", Asignatura 2=" + y + "]";
	}

	public String toString2() {
		return "Nota 2 [Asigantura 1=" + x + ", Asignatura 2=" + y + "]";
	}

	public void Teclado() {
		this.setx(LecturaDatos.ReadInt("Introduce Nota1"));
		this.sety(LecturaDatos.ReadInt("Introduce Nota2"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

	public void imprimeInforme2() {
		System.out.println(this.toString2());

	}

}
