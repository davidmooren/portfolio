package com.ejemplos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient annotation also allows us to query Discovery server to find microservices.
@EnableDiscoveryClient
public class Spring14cClienterServiceApplication {

	public static final String ACCOUNTS_SERVICE_URL = "http://ACCOUNTS-MICROSERVICE";

	public static void main(String[] args) {
		SpringApplication.run(Spring14cClienterServiceApplication.class, args);
	}

	// Create using @LoadBalanced– Spring enhances it to service lookup & load
	// balancing
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AccountRepository accountRepository() {
		return new RemoteAccountRepository(ACCOUNTS_SERVICE_URL);
	}

}
