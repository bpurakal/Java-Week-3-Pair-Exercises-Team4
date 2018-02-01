package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	private BankAccount account;
	private BankAccount destAccount;
	
	@Before  //Before Annotation: Before each test gets called, Before gets called.
	public void setUp() throws Exception {
		account = new BankAccount();    //Arrange 
		destAccount = new BankAccount(); // new account to compare 
		
	}

	@Test
	public void testDeposit() {
		BigDecimal result = account.deposit(new BigDecimal(1000.00));
		assertEquals(new BigDecimal(1000.00), result);
	}

	@Test
	public void testWithdraw() {
		BigDecimal result = account.withdraw(new BigDecimal (250.00));
		assertEquals(new BigDecimal(-250.00), result);
	}

	@Test
	public void testTransfer() {
		account.deposit(new BigDecimal (100)); //deposit 100 into account
		account.transfer(destAccount, new BigDecimal(20.00)); //transferring 20 from account into destination account
		//subtract, get, add 
		BigDecimal result = account.getBalance(); // 80
		BigDecimal otherResult = destAccount.getBalance(); //20
		assertEquals(new BigDecimal(80.00), result);
		assertEquals(new BigDecimal(20.00), otherResult);
		
	}

	@Test
	public void testAcountNumber() {
		account.setAccountNumber("1234");
		assertEquals("1234", account.getAcountNumber());
	}

	@Test
	public void testGetBalance() {
		BigDecimal result = account.getBalance();
		assertEquals(new BigDecimal(0), result);
	}

}
