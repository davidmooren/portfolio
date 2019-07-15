package com.ejemplos.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Beer;
import com.ejemplos.spring.service.BeerExpert;
import com.ejemplos.spring.repository.BeerRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class BeerController {
    private BeerRepository repository;

    public BeerController(BeerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/good-beers")
    //Para usar CORS
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Beer> goodBeers() {

    	//Utiliza Streams porque es más fácil para filtrar
        return repository
        		.findAll()
        		.stream()
        		//Curioso como se puede filtrar ;-)
                .filter(BeerExpert::isGreat)
                .collect(Collectors.toList());
    }
}
