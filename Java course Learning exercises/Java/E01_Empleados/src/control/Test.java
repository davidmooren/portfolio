package control;

import beans.Empleado;
import gui.Menu;
import utilidades.LecturaDatos;
import servicios.IServiciosEmpresa;
import servicios.ServiciosEmpresa;

public class Test {

	IServiciosEmpresa servicios = new ServiciosEmpresa();

	/*
	 * public static void instancias () { Empleado e=new Empleado();
	 * e.datosbasicos();
	 * 
	 * }
	 */

	public void start() {

		boolean seguir = false;
		do {
			Menu.mostrarMenu();
			seguir = this.seleccionOpciones();
		} while (seguir);
		System.out.println("   --- Fin de la sesion ---");

	}

	public boolean seleccionOpciones() {

		boolean continuar = true;
		switch (LecturaDatos.leerInt()) {
		case 1:
			// ALTA DE UN EMPLEADO
			servicios.addEmpleado();
			break;

		case 2:
			// ELIMINAR UN EMPLEADO
			servicios.eliminarEmpleado();
			break;

		case 3:
			// LISTAR EMPLEADOS
			servicios.listado();
			break;

		case 4:
			// INDICAR SI EXISTE UN EMPLEADO
			servicios.existeEmpleado();
			break;

		case 5:
			// MODIFICAR DATOS DE UN EMPLEADO
			servicios.modificarEmpleado();
			break;

		case 6:
			// INCENTIVAR DATOS DE UN DIRECTOR
			servicios.addDirector();
			break;

		case 7:
			// CASOS DE PRUEBA
			servicios.addGerente();
			break;

		case 0:
			continuar = salir();
			break;
		}

		return continuar;
	}

	private boolean salir() {
		String sino = LecturaDatos.leerString("   ¿Esta seguro?(S/N)");
		return (sino.toUpperCase().charAt(0) != 'S');
	}

}
