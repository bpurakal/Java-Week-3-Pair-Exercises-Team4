package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {
private HourlyWorker hourlyWorker;
private HourlyWorker byTheHour;

	@Before
	public void setUp() throws Exception {
	hourlyWorker= new HourlyWorker("Joe", "Smith", 10);
	byTheHour= new HourlyWorker("Joe", "SMith", -10);
	}

	@Test
	public void canCountWeeklyPay() {
		double result= hourlyWorker.calculateWeeklyPay(30);
		assertEquals(300, result,0.00);
	}
	@Test
	public void canCountOverTime() {
		double result= hourlyWorker.calculateWeeklyPay(50);
		assertEquals(550, result, 0.00);
	}
	@Test
	public void nonNegativePayrate() {
		double result=byTheHour.calculateWeeklyPay(35);
		assertEquals(35, result, 35.00);
	}
	
	@Test
	public void nonNegativeHours() {
		double result= byTheHour.calculateWeeklyPay(-20);
		assertEquals(-20, result, -20.00);
	}
	
	@Test
	
	public void test() {
		fail("Not yet implemented");
	}

}
