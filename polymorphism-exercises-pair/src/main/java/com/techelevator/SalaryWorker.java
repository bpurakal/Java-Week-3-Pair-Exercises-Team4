package com.techelevator;

import java.math.BigDecimal;

public class SalaryWorker implements Worker{
private double annualSalary;
private String firstName;
private String lastName;
private int hoursWorked;

public SalaryWorker(String firstName, String lastName, double annualSalary) {
	this.firstName= firstName;
	this.lastName= lastName;
	this.annualSalary= annualSalary;
}
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public double getAnnualSalary() {
	if (annualSalary > 0) {
			return annualSalary;
			}
	else return 0;
}

public double calculateWeeklyPay(int hoursWorked) {
	if (annualSalary >0 && hoursWorked >0) {
	double pay = annualSalary/52;
	return pay;}
	else {
		return hoursWorked;
	}
}

public int getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
} 

	
}
