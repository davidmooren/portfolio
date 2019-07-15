package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ejemplos.spring.model.Beer;

// Al usar esta anotación se indican todas las operaciones CRUD como puntos REST (endpoints)
// Es decir, puedo llamar a cualquier operación REST desde URL

@RepositoryRestResource
//Para usar CORS
//En principio para un listado no haria falta, pero como trabajamos otras acciones del REST, lo necesiyto para que sean directas
@CrossOrigin(origins = "http://localhost:4200")
//The @RepositoryRestResource annotation creates endpoints for the Beer entity at http://localhost:8080/beers.
//Por ese motivo pongo esa direccion en las llamadas de beer-edit.service.ts
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
