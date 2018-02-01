package com.techelevator;

public class HourlyWorker implements Worker{
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private int hoursWorked;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		this.hourlyRate= hourlyRate;
		this.lastName= lastName;
		this.firstName= firstName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double calculateWeeklyPay(int hoursWorked) {
		if(hoursWorked> 0 && hourlyRate >0) {
		double pay;
		if (hoursWorked <= 40) {
			pay =hourlyRate * hoursWorked;
			return pay;
		} else {
			int overtime = (hoursWorked -40);
			pay = overtime * 1.5 * hourlyRate;
			pay = pay + (hourlyRate * 40);
			return pay;
		} 
		
		}
		return hoursWorked;		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	
	
}
