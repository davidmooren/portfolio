package control;

import beans.Alumnos;
import beans.Asignaturas;
import beans.Notas;
import beans.Profesores;

public class Test {

	public static void Teest() {
		Alumnos A = new Alumnos();
		Alumnos B = new Alumnos();

		A.Teclado();
		A.toString();
		A.imprimeInforme();

		B.Teclado();
		B.toString2();
		B.imprimeInforme2();

		Asignaturas C = new Asignaturas();
		Asignaturas D = new Asignaturas();

		C.Teclado();
		C.toString();
		C.imprimeInforme();

		D.Teclado();
		D.toString2();
		D.imprimeInforme2();

		Notas E = new Notas();
		Notas F = new Notas();

		E.Teclado();
		E.toString();
		E.imprimeInforme();

		F.Teclado();
		F.toString2();
		F.imprimeInforme2();

		Profesores G = new Profesores();
		Profesores H = new Profesores();

		G.Teclado();
		G.toString();
		G.imprimeInforme();

		H.Teclado();
		H.toString2();
		H.imprimeInforme2();

	}
}
