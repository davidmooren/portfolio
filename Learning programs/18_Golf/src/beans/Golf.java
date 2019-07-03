package beans;

import utilidades.LecturaDatos;

public class Golf {

	private int Edad;
	private boolean dad = false;
	private boolean mum;
	private String nombre;
	private final int CUOTA_FIJA = 500;
	private final double DESC_50 = 0.5, DESC_35 = 0.65, DESC_25 = 0.75, DESC_15 = 0.85;
	private double descuento, cuota;

	public Golf() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}

	public boolean isdad() {
		return dad;
	}

	public void setdad(boolean dad) {
		this.dad = dad;
	}

	public boolean ismum() {
		return mum;
	}

	public void setmum(boolean mum) {
		this.mum = mum;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void DescuentosSocio() {

		this.setEdad(LecturaDatos.leerInt("Edad:"));
		this.setmum(LecturaDatos.leerBoolean("¿Es mujer? true=si / false=no"));
		this.setdad(LecturaDatos.leerBoolean("¿Es padre socio? true=si / false=no"));

		if (this.Edad > 65) {
			this.cuota = CUOTA_FIJA * DESC_50;
			this.descuento = 50;
			System.out.println("La cuota del socio es " + this.getCuota() + "€ porque tiene un descuento del "
					+ this.getDescuento() + "%");
		} else if (this.Edad < 18) {
			if (this.dad) {
				this.cuota = CUOTA_FIJA * DESC_35;
				this.descuento = 35;
				System.out.println("La cuota del socio es " + this.getCuota() + "€ porque tiene un descuento del "
						+ this.getDescuento() + "%");
			} else {
				this.cuota = CUOTA_FIJA * DESC_25;
				this.descuento = 25;
				System.out.println("La cuota del socio es " + this.getCuota() + "€ porque tiene un descuento del "
						+ this.getDescuento() + "%");
			}
		} else {
			if (this.mum) {
				this.cuota = CUOTA_FIJA * DESC_15;
				this.descuento = 15;
				System.out.println("La cuota del socio es " + this.getCuota() + "€ porque tiene un descuento del "
						+ this.getDescuento() + "%");
			} else {
				this.cuota = CUOTA_FIJA;
				System.out.println("La cuota del socio es " + this.getCuota() + "€ porque tiene un descuento del "
						+ this.getDescuento() + "%");
			}
		}

	}

}
