package services;

import model.Cerveza;

public class ExpertoCervezas {

	public static Cerveza recomendador(String tipo) {
		
		Cerveza cerveza;
		
		if (tipo.equalsIgnoreCase("trigo")){
			cerveza = new Cerveza("Franziskaner",(byte)5,"trigo");
		}else if(tipo.equalsIgnoreCase("tostada")) {
			cerveza = new Cerveza("Grimberger Tostada (de barril)",(byte)4,"tostada");
		}
		else {
			cerveza = new Cerveza("Mahou",(byte)5,"madrileñha");
		}

		return cerveza;
		
	}

}
