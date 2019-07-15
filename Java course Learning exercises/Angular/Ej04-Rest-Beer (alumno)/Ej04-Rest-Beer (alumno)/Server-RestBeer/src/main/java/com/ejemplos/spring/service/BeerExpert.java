package com.ejemplos.spring.service;

import com.ejemplos.spring.model.Beer;

public class BeerExpert {
	
    //Evito las cervezas con estas caracteristicas
    public static boolean  isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coronita") &&
                !beer.getName().equals("Cruzcampo");
    }

}
