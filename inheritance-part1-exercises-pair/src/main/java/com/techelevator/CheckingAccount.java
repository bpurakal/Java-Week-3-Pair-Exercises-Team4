package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	//if we have to pass along variables then we use super, if bankaccount passes in account number, do so similarly with checking account

	@Override //has to match withdraw method in BankAccount class.
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		
		
		if((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal("-90.00")) <= 0)) {
			return getBalance();
		}
		else if ((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal("0.00")) < 0)) {
			super.withdraw(amountToWithdraw);
			super.withdraw(new BigDecimal("10"));
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
