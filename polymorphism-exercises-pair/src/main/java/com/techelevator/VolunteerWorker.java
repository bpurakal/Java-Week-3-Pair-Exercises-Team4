package com.techelevator;

public class VolunteerWorker implements Worker{

	private String lastName;
	private String firstName;
	private double volunteerPay = 0;
	private int hoursWorked;
	
	public VolunteerWorker(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getVolunteerPay() {
		return volunteerPay;
	}

	public double calculateWeeklyPay(int hoursWorked) {
		if (hoursWorked > 0) {
			return volunteerPay;
		} else return 0;
	} 

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
}
