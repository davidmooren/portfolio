package employee;

import empresa.Imprimir;

public class Info {

	private String Nombre;

	private String Apellido;

	private String Direccion;

	private String Mail;

	private int DNI;

	public Info() {
		super();

	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String Direcccion) {
		this.Direccion = Direcccion;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String Mail) {
		this.Mail = Mail;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	@Override
	public String toString() {
		return "Info [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Mail=" + Mail
				+ ", DNI=" + DNI + "]";
	}

	public void Depar() {
		System.out.println("Introduce Datos");
		System.out.println(Imprimir.ReadString("Nombre " + Nombre));
		System.out.println(Imprimir.ReadString("Apellido " + Apellido));
		System.out.println(Imprimir.ReadString("Direccion" + Direccion));
		System.out.println(Imprimir.ReadInt("DNI " + DNI));
		System.out.println(Imprimir.ReadString("Mail " + Mail));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}
}
