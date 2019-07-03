package beans;

import utilidades.LecturaDatos;

public class Loteria {

	// Numeros ganadores

	private final int Num1 = 1;
	private final int Num2 = 2;
	private final int Num3 = 3;
	private final int Num4 = 4;

	private final int Num5 = 5;
	private final int Num6 = 6;
	private final int Num7 = 7;
	private final int Num8 = 8;

	// Variables

	public Loteria() {
		super();
	}

	// 1

	private int Num11;

	public void setNum11(int Num11) {
		this.Num11 = Num11;
	}

	public int getNum11() {
		return Num11;
	}

	// 2

	private int Num22;

	public void setNum22(int Num22) {
		this.Num22 = Num22;
	}

	public int getNum22() {
		return Num22;
	}

	// 3

	private int Num33;

	public void setNum33(int Num33) {
		this.Num33 = Num33;
	}

	public int getNum33() {
		return Num33;
	}

	// 4

	private int Num44;

	public void setNum44(int Num44) {
		this.Num44 = Num44;
	}

	public int getNum44() {
		return Num44;
	}

	// 5

	private int Num55;

	public void setNum55(int Num55) {
		this.Num55 = Num55;
	}

	public int getNum55() {
		return Num55;
	}
	// 6

	private int Num66;

	public void setNum66(int Num66) {
		this.Num66 = Num66;
	}

	public int getNum66() {
		return Num66;
	}

	// 7

	private int Num77;

	public void setNum77(int Num77) {
		this.Num77 = Num77;
	}

	public int getNum77() {
		return Num77;
	}
	// 8

	private int Num88;

	public void setNum88(int Num88) {
		this.Num88 = Num88;
	}

	public int getNum88() {
		return Num88;
	}

	public void Opci() {
		System.out.println("Bienvenido a la primitiva. Muucha Sueerte");
		this.setNum11(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum22(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum33(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum44(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum55(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum66(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum77(LecturaDatos.leerInt("Introduzca numero: "));
		this.setNum88(LecturaDatos.leerInt("Introduzca numero: "));

		System.out.println();
		if (this.getNum11() == Num1 && this.getNum22() == Num2 && this.getNum33() == Num3 && this.getNum44() == Num4
				&& this.getNum55() == Num5 && this.getNum66() == Num6 && this.getNum77() == Num7
				&& this.getNum88() == Num8) {

			System.out.println("HAS GANADOOO!!!");
		} else {
			System.out.println("Intentalo otraa veez!!");
		}
	}
}
