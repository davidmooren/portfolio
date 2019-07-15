package com.ejemplos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//Fijate en la segunda anotacion
/*
* You’ll first need a Eureka Service registry. 
* You can use Spring Cloud’s @EnableEurekaServer to standup a registry that other applications can talk to. 
* This is a regular Spring Boot application with one annotation added to enable the service registry.
*/
@EnableEurekaServer
public class Spring14aDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring14aDiscoveryServiceApplication.class, args);
	}

}
