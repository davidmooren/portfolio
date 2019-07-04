package point;

import utility.LecturaDatos;

public class Punto {

	private int x;
	private int y;

	public Punto() {
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
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public String toString2() {
		return "Punto 2 [x=" + x + ", y=" + y + "]";
	}

	public void Teclado() {
		this.setx(LecturaDatos.ReadInt("Introduce coordenada x"));
		this.sety(LecturaDatos.ReadInt("Introduce coordenada y"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

	public void imprimeInforme2() {
		System.out.println(this.toString2());

	}

}
