package Car;

public class Vehiculo {
	public static void main(String[] args) {

		Coche C = new Coche();

		C.setAņoFabricacion(1950);
		C.setColor("Azul");
		C.setMatricula(548755);
		C.setModalidadSeguro("Todoriesgo");
		C.setPinturaMetalizada(false);
		C.setModelo("TodoTerreno");
		C.setTipoCoche("Deportivo");

		System.out.println(C.toString());

		C.setAņoFabricacion(192320);

		System.out.println(C.toString2());

		CARR R = new CARR();

		R.setAņoFabricacion(2500);

		System.out.println(R.toString());

	}
}
