package beans;

import java.util.Date;

import utilidades.LecturaDatos;

public class Empleado {

	private String nombre;
	private float salario;
	private Date fechnaci;

	public Empleado() {
	}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre, float salario, Date fechnaci) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechnaci = fechnaci;
	}

	public String getnombre() {
		return nombre;

	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public float getsalario() {
		return salario;

	}

	public void setsalario(float salario) {
		this.salario = salario;
	}

	public Date getfechnaci() {
		return fechnaci;

	}

	public void setfechnaci(Date fechnaci) {
		this.fechnaci = fechnaci;
	}

	// Metodos

	public void datosbasicos() {

		this.getnombre();

	}

	// Para array

	private int cantidad;

	public int getcantidad() {
		return cantidad;

	}

	public void setcantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	static String[] name = new String[5];
	static int[] salarioo = new int[5];

	public int[] getsalarioo() {
		return salarioo.clone();
	}

	public void crearEmpleado() {

		this.setcantidad(5);

		/*
		 * String [] name = new String[cantidad]; int[]salarioo = new int
		 * [cantidad];
		 */

		System.out.println("Introduce 5 empleados");
		System.out.println("");

		for (int counter = 0; counter < cantidad; counter++) {
			System.out.println("Introduce el nombre del empleado " + (counter + 1) + ":");
			name[counter] = LecturaDatos.leerString();
			System.out.println("Introduce el salario del empleado  " + (counter + 1) + ":");
			salarioo[counter] = LecturaDatos.leerInt();
		}

		/*
		 * this.nombre = LecturaDatos.leerString("Introduzca el nombre:");
		 * this.salario = LecturaDatos.leerInt("Introduzca el salario:");
		 * this.fechnaci = new Date();
		 */

		System.out.println("");

		System.out.println("Los datos del empleado son:");
		System.out.println("");

		for (int counter = 0; counter < cantidad; counter++) {
			System.out.println("Nombre empleado " + (counter + 1) + ":" + name[counter]);
			System.out.println("Salario empleado " + (counter + 1) + ":" + salarioo[counter]);
		}

		/*
		 * System.out.println("Nombre:"+this.getnombre());
		 * System.out.println("Salario:"+this.getsalario()); System.out.println(
		 * "Dado de alta en:"+" "+this.getfechnaci());
		 */
	}

	public void Listarempleado() {

		System.out.println("Los datos del empleado son:");

		// System.out.println(name);

		/*
		 * Empleado a = new Empleado(); a.crearEmpleado();
		 */

		for (int counter = 0; counter < 5; counter++) {
			System.out.println("Nombre empleado " + (counter + 1) + ":" + name[counter]);
			System.out.println("Salario empleado " + (counter + 1) + ":" + salarioo[counter]);
		}
	}
}
