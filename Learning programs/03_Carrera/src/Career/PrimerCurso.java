package Career;

public class PrimerCurso extends Carrera {

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
		return "PrimerCurso Primera Asignatura [Nombre=" + Nombre + ", CodigoNumerico=" + CodigoNumerico
				+ ", CursoEnElQueSeImparte=" + CursoEnElQueSeImparte + "]";
	}

	public String toString2() {
		return "PrimerCurso Segunda Asignatura [Nombre=" + Nombre + ", CodigoNumerico=" + CodigoNumerico
				+ ", CursoEnElQueSeImparte=" + CursoEnElQueSeImparte + "]";

	}

}
