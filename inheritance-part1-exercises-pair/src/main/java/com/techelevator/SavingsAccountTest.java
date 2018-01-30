package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

	

public class SavingsAccountTest {

	private SavingsAccount account;
	@Before
	public void setUp() throws Exception {
		 account = new SavingsAccount();
		 account.deposit(new BigDecimal("1000"));
	}

	@Test
	public void testWithdraw() {
		BigDecimal result = account.withdraw(new BigDecimal (250.00));
		assertEquals(new BigDecimal(750.00), result);
	}
	
	@Test
	public void testOverdraw() {
		BigDecimal result = account.withdraw(new BigDecimal("2000"));
		assertEquals(new BigDecimal("1000"), result);
	}
	
	@Test
	public void testPenaltyFee() {
		BigDecimal result = account.withdraw(new BigDecimal("900"));
		assertEquals(new BigDecimal("98"), result);
	}

}
