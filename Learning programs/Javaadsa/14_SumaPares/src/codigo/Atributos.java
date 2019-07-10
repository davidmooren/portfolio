package codigo;

import lectura.Lectura;

public class Atributos {

	private int Edad;

	private int sumaDePares, i;
	private final int cantidadNumeros = 7;

	public int getSumaDePares() {
		return sumaDePares;
	}

	public void setSumaDePares(int sumaDePares) {
		this.sumaDePares = sumaDePares;
	}

	public int getCantidadNumeros() {
		return cantidadNumeros;
	}

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
		return "Atributos [Edad=" + Edad + ", sumaDePares=" + sumaDePares + ", i=" + i + ", cantidadNumeros="
				+ cantidadNumeros + "]";
	}

	public void Teclado() {
		System.out.println("Introduce numero:");
		this.setEdad(Lectura.ReadInt("Sumare solo los pares precedentes"));

		System.out.print("Para n = " + Edad + " (tope)-> ");
		i = 1;
		sumaDePares = 0;
		do {
			if (i % 2 == 0) {
				System.out.print(i + "+");
				sumaDePares += i;
			}
			i++;
		} while (sumaDePares <= Edad);

		System.out.println("\nSuma=" + sumaDePares + "\n");
	}

	public void sumaDeParesCantidad() {
		System.out.print("Para n = " + Edad + " (cantidad)-> ");
		i = 1;
		sumaDePares = 0;
		while (i <= Edad * 2) {
			if (i % 2 == 0) {
				System.out.print(i + "+");
				sumaDePares += i;
			}
			i++;
		}

		System.out.println("\nSuma=" + sumaDePares + "\n");
	}

	public void imprimeInforme() {
		System.out.println(this.toString());
	}

}
