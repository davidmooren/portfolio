package beans;

import utilidades.LecturaDatos;
import control.Condicionantes;

public class Monedas {

	private static int unCent = 1;
	private static int dosCent = 2;
	private static int cincoCent = 5;
	private static int diezCent = 10;
	private static int veinteCent = 20;
	private static int cincuentaCent = 50;
	private static int unEuro = 100;
	private static int dosEuros = 200;		
	
		
		public static void Mooneedas() {
			
			int cantidad = 0;
			double importe = LecturaDatos.leerDouble("Introduzca el importe en euros: ");
			importe = importe * 100;
			
			while(importe - dosEuros >= 0) {
				importe -= dosEuros;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 2€");
			cantidad = 0;
			
			while(importe - unEuro >= 0) { 
				importe -= unEuro;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 1€");
			cantidad = 0;
			
			while(importe - cincuentaCent >= 0) { 
				importe -= cincuentaCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.5€");
			cantidad = 0;
			
			while(importe - veinteCent >= 0) { 
				importe -= veinteCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.2€");
			cantidad = 0;
			
			while(importe - diezCent >= 0) { 
				importe -= diezCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.1€");
			cantidad = 0;
			
			while(importe - cincoCent >= 0) { 
				importe -= cincoCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.05€");
			cantidad = 0;
			
			while(importe - dosCent >= 0) { 
				importe -= dosCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.02€");
			cantidad = 0;
			
			while(importe - unCent >= 0) { 
				importe -= unCent;
				cantidad++;
			}
			System.out.println(cantidad + " monedas de 0.01€");
			cantidad = 0;
		}
	
	}
	
	

