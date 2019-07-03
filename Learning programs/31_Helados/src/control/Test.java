package control;

import beans.Cobertura;
import beans.Helado;
import beans.IceCream;

public class Test {

	public static void prueba1() {
		Helado h1 = new Helado("CHOOCOLAATE", IceCream.MINI, Cobertura.CHOCOLATE);
		System.out.println(h1);

	}
}
