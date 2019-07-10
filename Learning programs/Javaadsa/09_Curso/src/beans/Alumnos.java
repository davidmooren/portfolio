package beans;

import utility.LecturaDatos;

public class Alumnos {

	private String nombre;
	private String curso;

	public Alumnos() {
		super();
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getcurso() {
		return curso;
	}

	public void setcurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno1 [nombre=" + nombre + ", curso=" + curso + "]";
	}

	public String toString2() {
		return "Alumno2 [nombre=" + nombre + ", curso=" + curso + "]";
	}

	public void Teclado() {
		this.setnombre(LecturaDatos.ReadString("Introduce el nombre"));
		this.setcurso(LecturaDatos.ReadString("Introduce el curso"));
	}

	public void imprimeInforme() {
		System.out.println(this.toString());

	}

	public void imprimeInforme2() {
		System.out.println(this.toString2());

	}

}
