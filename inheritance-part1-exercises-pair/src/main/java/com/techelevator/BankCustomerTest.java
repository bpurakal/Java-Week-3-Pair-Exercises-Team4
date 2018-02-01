package com.techelevator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {

	private BankCustomer customer;
	private CheckingAccount check;
	private SavingsAccount save;
	private BankAccount bank;
	
	
	@Before
	public void setUp() throws Exception {
		customer = new BankCustomer("Joe", "123 Sesame St", "111-111-1111");
		bank = new BankAccount();
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

}
