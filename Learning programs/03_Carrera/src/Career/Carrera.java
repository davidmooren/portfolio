package Career;

public class Carrera {

	public static void main(String[] args) {

		PrimerCurso C = new PrimerCurso();

		C.setNombre("Java");
		C.setCodigoNumerico(111);
		C.setCursoEnElQueSeImparte("PrimerCurso");

		System.out.println(C.toString());

		PrimerCurso A = new PrimerCurso();

		A.setNombre("Web");
		A.setCodigoNumerico(626);
		A.setCursoEnElQueSeImparte("	PrimerCurso");

		System.out.println(A.toString2());

		SegundoCurso R = new SegundoCurso();

		R.setNombre("Angular");
		R.setCodigoNumerico(555);
		R.setCursoEnElQueSeImparte("SegundoCurso");

		System.out.println(R.toString());

		SegundoCurso F = new SegundoCurso();

		F.setNombre2("Net");
		F.setCodigoNumerico2(222);
		F.setCursoEnElQueSeImparte2("SegundoCurso");

		System.out.println(F.toString2());

	}
}
