package com.techelevator;

public class PayRate {  

	public static void main(String[] args) {
		
		VolunteerWorker rob = new VolunteerWorker("Rob", "Roy"); 
		VolunteerWorker shane = new VolunteerWorker("Shane", "Oneil");
		HourlyWorker robert = new HourlyWorker("Robert", "Misener", 8);
		HourlyWorker noah = new HourlyWorker("Noah", "Hornak", 9);
		HourlyWorker kathy= new HourlyWorker("Kathy", "Walker", 9);
		HourlyWorker anna= new HourlyWorker("Anna", "Penta", 8);
		SalaryWorker craig = new SalaryWorker("Craig", "Lawrie",32000);
		SalaryWorker alastair = new SalaryWorker("Alastair", "Bull", 36000);
		
		Worker[] listOfWorkers = {robert, noah, kathy, anna, craig, alastair, rob, shane};
		double totalHours = 0;
		double totalPay = 0;
		for(Worker element: listOfWorkers) {
		String name= element.getFirstName();
		String surname= element.getLastName();
		double newRandom = (int)(Math.random()*75);
		totalHours= totalHours + newRandom;
		
		double weeklyPay= element.calculateWeeklyPay((int)(Math.random()*75));
		totalPay= totalPay + weeklyPay;
	System.out.println(name + " " + surname + "-" +weeklyPay+ " for " + newRandom + "hours worked.");
		System.out.println("Total Hours Worked: " + totalHours);
		System.out.printf("Total Payroll for week: $%.2f" , totalPay);
		}
		
		
		
		
		
	}

}
