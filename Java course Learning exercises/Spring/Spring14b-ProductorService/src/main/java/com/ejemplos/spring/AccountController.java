package com.ejemplos.spring;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Antonio Santos
 *
 */
@RestController
public class AccountController {

	protected Logger logger = Logger.getLogger(AccountController.class.getName());

	@Autowired
	AccountRepository accountRepository;

	@RequestMapping("/accounts")
	public Account[] all() {
		logger.info("---- Se ha invocado el microservicio ACCOUNTS/ALL");
		List<Account> accounts = accountRepository.getAllAccounts();
		logger.info("---- El microservicio ACCOUNTS/ALL ha encontrado: " + accounts.size() + " valores");
		return accounts.toArray(new Account[accounts.size()]);
	}

	@RequestMapping("/accounts/{id}")
	public Account byId(@PathVariable("id") String id) {
		logger.info("---- Se ha invocado el microservicio ACCOUNTS/byID(): " + id);
		Account account = accountRepository.getAccount(id);
		logger.info("---- El microservicio ACCOUNTS/byID("+id+") ha encontrado: " + account + " valores");
		return account;
	}
}
