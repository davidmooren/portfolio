package com.ejemplos.spring.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.Beer;

import java.util.stream.Stream;

//Utiliza el repositorio y crea un conjunto de datos por defecto.
//Tambien se puede colocar en la clase que arranca @SpringBootApplication
//Añadirías lo siguiente

/*
 @Bean
 ApplicationRunner init(BeerRepository repository) {
     return args -> {
         Stream.of("Heineken", "Beer", "Leffe", "King Julius",
             "Budweiser", "Paulaner", "Franziskaner").forEach(name -> {
             Beer beer = new Beer();
             beer.setName(name);
             repository.save(beer);
         });
         repository.findAll().forEach(System.out::println);
     };
 }

*/

@Component
public class BeerCommandLineRunner implements CommandLineRunner {

 private final BeerRepository repository;

 public BeerCommandLineRunner(BeerRepository repository) {
     this.repository = repository;
 }

 @Override
 public void run(String... strings) throws Exception {
     // Top beers from https://www.beeradvocate.com/lists/top/
     Stream.of("Heineken", "Beer", "Leffe", "Cruzcampo", "King Julius",
             "Budweiser", "Paulaner", "Franziskaner").forEach(name ->
             repository.save(new Beer(name))
     );
     repository.findAll().forEach(System.out::println);
 }
}
