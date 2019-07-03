package Career;

public class SegundoCurso extends Carrera {

	private String Nombre;

	private int CodigoNumerico;

	private String CursoEnElQueSeImparte;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public int getCodigoNumerico() {
		return CodigoNumerico;
	}

	public void setCodigoNumerico(int CodigoNumerico) {
		this.CodigoNumerico = CodigoNumerico;
	}

	public String getCursoEnElQueSeImparte() {
		return CursoEnElQueSeImparte;
	}

	public void setCursoEnElQueSeImparte(String CursoEnElQueSeImparte) {
		this.CursoEnElQueSeImparte = CursoEnElQueSeImparte;
	}

	@Override
	public String toString() {
		return "SegundoCurso Primera Asignatura [Nombre=" + Nombre + ", CodigoNumerico=" + CodigoNumerico
				+ ", CursoEnElQueSeImparte=" + CursoEnElQueSeImparte + "]";
	}

	private String Nombre2;

	private int CodigoNumerico2;

	private String CursoEnElQueSeImparte2;

	public String getNombre2() {
		return Nombre2;
	}

	public void setNombre2(String Nombre2) {
		this.Nombre2 = Nombre2;
	}

	public int getCodigoNumerico2() {
		return CodigoNumerico2;
	}

	public void setCodigoNumerico2(int CodigoNumerico2) {
		this.CodigoNumerico2 = CodigoNumerico2;
	}

	public String getCursoEnElQueSeImparte2() {
		return CursoEnElQueSeImparte2;
	}

	public void setCursoEnElQueSeImparte2(String CursoEnElQueSeImparte2) {
		this.CursoEnElQueSeImparte2 = CursoEnElQueSeImparte2;
	}

	public String toString2() {
		return "SegundoCurso Segunda Asignatura [Nombre=" + Nombre2 + ", CodigoNumerico=" + CodigoNumerico2
				+ ", CursoEnElQueSeImparte=" + CursoEnElQueSeImparte2 + "]";

	}

}
