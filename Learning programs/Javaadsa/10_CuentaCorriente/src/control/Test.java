package control;

import beans.CuentaCorriente;
import beans.Ingresos;

public class Test {

	public static void Teest() {
		CuentaCorriente A = new CuentaCorriente();

		A.Teclado();
		A.toString();
		A.imprimeInforme();

		Ingresos C = new Ingresos();

		C.Teclado();
		C.toString();
		C.imprimeInforme();

	}
}
