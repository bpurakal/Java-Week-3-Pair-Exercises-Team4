package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {

	private CheckingAccount account;
	
	@Before
	public void setUp() throws Exception {
		 account = new CheckingAccount();
		 account.deposit(new BigDecimal("1000"));
	}

	@Test
	public void testWithdraw() {
		BigDecimal result = account.withdraw(new BigDecimal (250.00));
		assertEquals(new BigDecimal(750.00), result);
	}

}
