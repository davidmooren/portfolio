package codigo;

import lectura.Lectura;

public class Atributos {

	private int Edad;

	int factorial = 1;

	public Atributos() {
		super();
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}

	@Override
	public String toString() {
		return "La edad es [Edad=" + this.getEdad() + "]";
	}

	public void Teclado() {
		System.out.println("Introduce un numero:");
		this.setEdad(Lectura.ReadInt("Te dire el factorial"));

		if (Edad == 0 || Edad == 1) {
		} else {
			for (int i = 1; i <= Edad; i++) {
				factorial = factorial * i;
			}
		}
		System.out.println("El factorial de " + Edad + " es " + factorial);
	}

	public void imprimeInforme() {
		System.out.println(this.toString());
	}

}
