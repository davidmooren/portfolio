package beans;

import utilidades.Imprimir;

public class Rectangulo {

	private int altura;
	private int base;
	private int area;

	public int getaltura() {
		return altura;
	}

	public void setaltura(int altura) {
		this.altura = altura;
	}

	public int getbase() {
		return base;
	}

	public void setbase(int base) {
		this.base = base;
	}

	public int getArea() {
		return area;
	}

	public void setarea(int area) {
		this.area = area;
	}

	public void keyboard() {
		this.setaltura(Imprimir.ReadInt("Dame una altura: "));
		this.setbase(Imprimir.ReadInt("Dame una base: "));
		this.setarea(base * altura);
		System.out.println("el area es:" + area);
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + this.getaltura() + ", base=" + base + ", area=" + area + "]";
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

}
