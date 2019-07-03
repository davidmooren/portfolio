package codigo;

import lectura.Lectura;

public class Atributos {

	private final int Edaad = 18;
	private int Edad;

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
		System.out.println("Introduce Edad:");
		this.setEdad(Lectura.ReadInt("Te dire si eres menor de edad o no"));

		if (Edaad <= Edad) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");

		}
	}

	public void imprimeInforme() {
		System.out.println(this.toString());
	}

}
