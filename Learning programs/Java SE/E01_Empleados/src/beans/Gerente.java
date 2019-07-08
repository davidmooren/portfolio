package beans;

import java.util.Date;

public class Gerente extends Empleado {

	private double incentivo = 5.0d;

	public Gerente() {
	}

	public Gerente(String nombre, float salario, Date fecha_nac, double incentivo) {
		super(nombre, salario, fecha_nac);
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public void incentivaar() {
		float cantidad = (float) ((float) salarioo[4] * (1 + incentivo / 100));
		super.setsalario(cantidad);
		System.out.println("Soy gerente y estoy incentivao: " + getsalario());
	}

	public void GerenteIncentivo() {
		Empleado newClassObj = new Empleado();
		int[] secondArray = newClassObj.getsalarioo();

		for (int counter = 0; counter < 1; counter++) {
			System.out.println("Nombre: " + name[4]);
			System.out.println("Salario: " + salarioo[4]);
		}
	}

	@Override
	public String toString() {
		String datos_emp = super.toString();
		return "Gerente{" + datos_emp + "incentivo=" + incentivo + '}';
	}

}
