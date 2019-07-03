package beans;

import utilidades.LecturaDatos;

public class AtributosParImpar {

	private int Num;

	// Constructores

	public AtributosParImpar() {
		super();
	}

	/*
	 * public AtributosParImpar() { super(); this.Num = Num; }
	 */

	// Setters y Getters

	public void setNum(int Num) {
		this.Num = Num;
	}

	public int getNum() {
		return Num;
	}

	// El toString()

	@Override
	public String toString() {
		return "El numero introducido es " + Num + "";
	}

	// La impresion de datos

	public void Teclado() {
		System.out.println("Introduce numero:");
		this.setNum(LecturaDatos.leerInt("Te dire si es par o impar"));
		if (Num % 2 != 0) {
			System.out.println("Es impar");
		} else {
			System.out.println("El numero es par");
		}
	}

	public void imprimeInforme() {
		System.out.println(this.toString());
	}

}
