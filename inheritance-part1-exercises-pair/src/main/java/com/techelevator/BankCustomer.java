package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private boolean isVIP;
	
	
	private List<BankAccount> accounts = new ArrayList<>();


	public BankCustomer(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.isVIP = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<BankAccount> getAccounts()  {
		return accounts;
		}

	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}
	
	public boolean isVIP(){
		BigDecimal balance = new BigDecimal("0");
		//BigDecimal vipBalance = new BigDecimal("25000");
		
		for(BankAccount element: accounts) {
			balance = balance.add(element.getBalance());
			if (balance.compareTo(new BigDecimal("25000.00")) >= 0) {
			return true;
		} 
	}return false;

}
}
	
	
