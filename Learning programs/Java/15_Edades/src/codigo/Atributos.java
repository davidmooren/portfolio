package codigo;

import lectura.Lectura;

public class Atributos {

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
		this.setEdad(Lectura.ReadInt("Te dire a que grupo perteneces"));

		if (Edad > 0 && Edad <= 4) {
			System.out.println("Pequeñín.");
		} else if (Edad > 4 && Edad <= 10) {
			System.out.println("Niño.");
		} else if (Edad > 10 && Edad <= 40) {
			System.out.println("Adolescente.");
		} else if (Edad > 40 && Edad <= 80) {
			System.out.println("Talludito.");
		}
	}

	public void imprimeInforme() {
		System.out.println(this.toString());
	}

}
