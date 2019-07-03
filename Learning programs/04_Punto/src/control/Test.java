package control;

import point.Punto;

public class Test {

	public static void Teest() {
		Punto A = new Punto();
		Punto B = new Punto();

		A.Teclado();
		A.toString();
		A.imprimeInforme();

		B.Teclado();
		B.toString();
		B.imprimeInforme2();

		System.out.println("-- calcular distancia --");
		System.out.println("Punto 1: X=" + A.getx() + " Y=" + A.gety());
		System.out.println("Punto 2: X=" + B.getx() + " Y=" + B.gety());
		double x = Math.pow((A.getx() - B.getx()), 2);
		double y = Math.pow((A.gety() - B.gety()), 2);
		double dist = Math.sqrt(x + y);
		System.out.println("Distancia: " + dist);

	}
}
