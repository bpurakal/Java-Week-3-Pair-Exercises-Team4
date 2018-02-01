package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {

	private BankCustomer customer;
	private CheckingAccount check;
	private SavingsAccount save;
	private BankAccount bank;
	private BankAccount accounts;
	
	@Before
	public void setUp() throws Exception {
		customer = new BankCustomer("Joe", "123 Sesame St", "111-111-1111");
		bank = new BankAccount();
		check = new CheckingAccount();
		save = new SavingsAccount();
		check.deposit(new BigDecimal ("10000"));
		save.deposit(new BigDecimal ("10000"));
		bank.deposit(new BigDecimal ("10000"));
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(check);
		accounts.add(save);
		accounts.add(bank);
	}

	@Test
	public void getAddressTest() {
		assertEquals(customer.getAddress(), "123 Sesame St");
	}
	
	@Test
	public void constructorTest() {
		assertNotNull(customer);
	}
	
	
	@Test 
	public void addAccountTest(){
		customer.addAccount(bank);
		assertEquals(bank, customer.getAccounts().get(0));
	}
	
	@Test
	public void isVIPTest() {
		customer.isVIP();
	}

}
