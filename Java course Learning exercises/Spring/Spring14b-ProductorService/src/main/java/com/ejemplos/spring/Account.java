package com.ejemplos.spring;

import java.io.Serializable;

/**
 * @author Antonio Santos
 *
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private String number;
	private String name;
	private Long amount;	

	public Account() {
		super();
	}

	public Account(String number, String name, Long amount) {
		super();
		this.amount = amount;
		this.number = number;
		this.name = name;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + "amount=" + amount + "]";
	}

}
