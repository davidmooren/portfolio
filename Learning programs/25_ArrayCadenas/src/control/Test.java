package control;

import beans.MetodosArray;

public class Test {

	public static void Condiciones() {
		String[] valores = { "Fusil", "para poder", " aprender", "Luego hacerlos ", "propios" };
		int suma = 0;
		for (String cad : valores) {
			int tam = MetodosArray.longCadena(cad);
			System.out.println("Long de <<" + cad + ">> " + tam + " Caracteres incluyendo los espacios");
			suma += tam;
		}
		System.out.println("En total la suma es: " + suma + " letras");
	}

}
