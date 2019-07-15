package com.ejemplos.spring;

import java.util.List;

/**
 * @author Antonio Santos
 *
 */
public interface AccountRepository {

	List<Account> getAllAccounts();

	Account getAccount(String number);
}
