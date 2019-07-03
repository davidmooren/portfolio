package empresa;

import employee.Departamentos;
import employee.Info;

public class Instancias {

	public static void Ins() {
		Departamentos a = new Departamentos();
		Info b = new Info();
		a.toString();
		a.Depar();
		a.imprimeInforme();

		b.Depar();
		b.imprimeInforme();
		b.toString();

	}
}
