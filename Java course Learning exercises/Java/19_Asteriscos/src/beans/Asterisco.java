package beans;

import utilidades.LecturaDatos;

public class Asterisco {

	private int Num;

	public Asterisco() {
		super();
	}

	public void setNum(int Num) {
		this.Num = Num;
	}

	public int getNum() {
		return Num;
	}

	public void PuntosAsteriscos() {
		this.setNum(LecturaDatos.leerInt("Introduzca numero de filas: "));

		System.out.println();
		for (int altura = 1; altura <= Num; altura++) {

			for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
