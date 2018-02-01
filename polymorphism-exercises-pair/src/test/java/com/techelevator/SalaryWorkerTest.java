package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {
private SalaryWorker salaryWorker;
private SalaryWorker salaryWorkertwo;

	@Before
	public void setUp() throws Exception {
	salaryWorker= new SalaryWorker("joe", "smith", 100000);
	salaryWorkertwo= new SalaryWorker("joe", "smith", -52000);	
	}

	@Test
	public void testCalculateWeeklyPay() {
		double result = salaryWorker.calculateWeeklyPay(40);
		assertEquals(result, salaryWorker.getAnnualSalary()/52, .02);
	}
	
	@Test
	public void testCalculateNegativePay() {
	double result = salaryWorkertwo.calculateWeeklyPay(40);
	assertEquals(0, salaryWorkertwo.getAnnualSalary()/52, .02);
	}
	

}
