package com.ejemplos.spring;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author Antonio Santos
 *
 */
public class RemoteAccountRepository implements AccountRepository {

	protected Logger logger = Logger.getLogger(AccountController.class.getName());

	// RESTTemplate es la clase que ofrece Spring para el acceso desde la parte
	//     cliente a Servicios REST.
	// Para consumir un servicio RESTful, Spring proporcionar la clase RestTemplate 
	//     que nos permite enviar peticiones HTTP a un servidor RESTful y recuperar 
	//     los datos en formatos como JSON y XML
	
	// RestTemplate ha sido configurado por Spring Cloud para usar un HttpRequestClient personalizado 
	//     que utiliza Netflix Ribbon para realizar la búsqueda del microservicio. 
	//     Ribbon además es un balanceador de carga, por lo que si tienes varias instancias 
	//     disponibles de un microservicio, selecciona una para ti.
	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
		logger.fine("-----[CONSTRUCTOR] serviceurl: " + this.serviceUrl);
	}

	@Override
	public List<Account> getAllAccounts() {
		logger.fine("----- [getAllAccounts]: serviceurl: " + this.serviceUrl);
		Account[] accounts = restTemplate.getForObject(serviceUrl + "/accounts", Account[].class);
		logger.fine("----- [getAllAccounts]: accounts: " + Arrays.asList(accounts));
		return Arrays.asList(accounts);
	}

	@Override
	public Account getAccount(String number) {
		logger.fine("----- [getAccount]: serviceurl: " + this.serviceUrl);
		logger.fine("----- [getAccount]: account: "
				+ restTemplate.getForObject(serviceUrl + "/accounts/{id}", Account.class, number));
		return restTemplate.getForObject(serviceUrl + "/accounts/{id}", Account.class, number);
	}

}
