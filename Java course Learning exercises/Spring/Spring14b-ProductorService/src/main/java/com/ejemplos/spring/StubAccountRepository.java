package com.ejemplos.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Antonio Santos
 *
 */
@Repository
public class StubAccountRepository implements AccountRepository {

	private Map<String, Account> accountsByNumber = new HashMap<String, Account>();

	public StubAccountRepository() {
		// public Account(String number, String name, Long amount)
		Account account = new Account("145-AST", "Antonio Herranz", 15385L);
		accountsByNumber.put("145-AST", account);
		account = new Account("202-VRT", "Virginia Sanz", 6375L);
		accountsByNumber.put("202-VRT", account);
		account = new Account("135-PMK", "Pilar López", 9385L);
		accountsByNumber.put("135-PMK", account);
		account = new Account("199-ATS", "Ángel García", 13418L);
		accountsByNumber.put("199-ATS", account);
		Logger.getLogger(StubAccountRepository.class).info("---- Se ha creado el repositorio StubAccountRepository");
	}

	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	@Override
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
