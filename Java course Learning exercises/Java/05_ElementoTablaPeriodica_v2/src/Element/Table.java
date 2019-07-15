package Element;

public class Table {
	public static void main(String[] args) {

		TablaPeriodica A = new TablaPeriodica();

		A.setNombre("Aluminio");
		A.setNumero(89);
		A.setSimbolo("Al");

		System.out.println(A.toString());
		System.out.println("He creado " + A.getnumIntancias() + " elementos");

	}
}
