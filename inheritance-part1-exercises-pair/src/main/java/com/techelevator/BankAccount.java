package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {

	private String accountNumber = new String();
	private BigDecimal balance = new BigDecimal(0); //default balance to 0 
	
	
	public BigDecimal deposit (BigDecimal amountToDeposit){
		return balance = balance.add(amountToDeposit); //Test adds 20 to balance 
	}
	
	public BigDecimal withdraw (BigDecimal amountToWithdraw){
		return balance = balance.subtract(amountToWithdraw);//Test 100 - 20
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		if (balance.compareTo(transferAmount) >= 0){ //if balance is greater than or equal to transfer amount
			this.withdraw(transferAmount); //withdrawing transferAmount from this account
			//BigDecimal destination = destinationAccount.getBalance(); //depositing transferAmount into destinationAccount ... transfer + destinationAccountBal
			destinationAccount.deposit(transferAmount);
		}
	}
	
	public String getAcountNumber() {
		return accountNumber;
	}
	
	public String setAccountNumber(String accountNumber) {
		return this.accountNumber = accountNumber; 
	}
	
	public BigDecimal getBalance() {
		return this.balance;
	}
	
}
