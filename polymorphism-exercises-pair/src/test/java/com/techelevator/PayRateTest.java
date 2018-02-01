package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PayRateTest {
private PayRate payrate;
private VolunteerWorker shane;
private SalaryWorker craig;
private HourlyWorker anna;
private VolunteerWorker joe;	
private VolunteerWorker john;
	
	
	
	@Before
	public void setUp() throws Exception {
	payrate = new PayRate();	
	anna= new HourlyWorker("Anna", "Penta", 10);
	craig = new SalaryWorker("Craig", "Lawrie",52000);
	shane = new VolunteerWorker("Shane", "Oneil");
	joe= new VolunteerWorker("Joe", "Smith");
	john = new VolunteerWorker("John", "Smith");
	Worker[] listOfWorkers = {anna, craig, shane};

	

	
	
	
	
	
	}
	
	@Test
	public void testCanFindTotalPay() {
	double totalPay=0;
	totalPay= anna.calculateWeeklyPay(40) + craig.calculateWeeklyPay(40) + shane.calculateWeeklyPay(40);
	assertEquals(totalPay, 1400, 1400);
	totalPay= anna.calculateWeeklyPay(80) + craig.calculateWeeklyPay(80) + shane.calculateWeeklyPay(40);
	assertEquals(totalPay, 2000, 2000);
	
	}
	@Test
	public void testUnpaidVolunteers() {
	double totalPay= 0;
	totalPay= john.calculateWeeklyPay(60) +joe.calculateWeeklyPay(30)+ shane.calculateWeeklyPay(10);
	assertEquals(totalPay, 0, 0);
	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
