package beans;

import utilidades.LecturaDatos;
import control.Condicionantes;

public class Limites {

	private int limitesuperior;
	private int limiteinferior;
	private int Num;

	public void setNum(int Num) {
		this.Num = Num;
	}

	public int getNum() {
		return Num;
	}

	public void setlimitesuperior(int limitesuperior) {
		this.limitesuperior = limitesuperior;
	}

	public int getlimitesuperior() {
		return limitesuperior;
	}

	public void setlimiteinferior(int limiteinferior) {
		this.limiteinferior = limiteinferior;
	}

	public int getlimiteinferior() {
		return limiteinferior;
	}

	public void Liimites() {

		this.setlimitesuperior(utilidades.LecturaDatos.leerInt("Introduce el l�mite superior: "));
		this.setlimiteinferior(utilidades.LecturaDatos.leerInt("Introduce el l�mite inferior: "));
		this.setNum(utilidades.LecturaDatos.leerInt("Introduce un n�mero: "));

		if (Num >= limiteinferior && Num <= limitesuperior) {
			System.out.println(Num + " est� dentro de los limites.");
			System.out.println("El cubo de " + Num + " es " + (Num * Num * Num));
		} else {
			System.out.println("ERROR " + Num + " no est� dentro del rango.");
		}

	}
}
