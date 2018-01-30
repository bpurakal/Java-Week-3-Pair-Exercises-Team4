package com.techelevator;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

	@Override 
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		
		
		if((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal("0.00")) <= 0)) {
			return getBalance();
		}
		else if ((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal("150.00")) < 0)) {
			super.withdraw(amountToWithdraw);
			super.withdraw(new BigDecimal("2"));
			return getBalance();
		}else {
			super.withdraw(amountToWithdraw);
			return getBalance();
		}
		//((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal("-100.00")) <= 0))
			//BALANCE - WITHDRAW >= -100.00 
			//super.withdraw(amountToWithdraw); 
			//balance = amountToWithdraw - new BigDecimal("-10.00");
		}
		
}
