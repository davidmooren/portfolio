package com.ejemplos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/*
 * There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper). 
 * 
 * @EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath.  
 * @EnableEurekaClient lives in spring-cloud-netflix and only works for eureka. 
 * 
 * If eureka is on your classpath, they are effectively the same.
 * Here @EnableDiscoveryClient activates the Netflix Eureka DiscoveryClient implementation
 */
@EnableDiscoveryClient
public class Spring14bProductorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring14bProductorServiceApplication.class, args);
	}

}
