package beans;

import utilidades.Imprimir;

public class Triangulo {

	private int lado1;
	private int lado2;
	private int lado3;

	public int getlado1() {
		return lado1;
	}

	public void setlado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getlado2() {
		return lado2;
	}

	public void setlado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getlado3() {
		return lado3;
	}

	public void setlado3(int lado3) {
		this.lado3 = lado3;
	}

	public void keyboard() {
		this.setlado1(Imprimir.ReadInt("Dame el lado 1: "));
		this.setlado2(Imprimir.ReadInt("Dame el lado 2: "));
		this.setlado3(Imprimir.ReadInt("Dame el lado 3: "));

		if (lado1 >= lado2) {
			if (lado1 >= lado3) {
				System.out.println("El lado de mayor longitud es: " + lado1);
			} else {
				System.out.println("El lado de mayor longitud es: " + lado3);
			}
		} else {
			if (lado2 >= lado3) {
				System.out.println("El lado de mayor longitud es: " + lado2);
			} else {
				System.out.println("El lado de mayor longitud es: " + lado3);
			}

		}

	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

}
