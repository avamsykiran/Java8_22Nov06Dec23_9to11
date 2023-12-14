package com.cts.jsld.service;

import com.cts.jsld.exceptions.InvalidAmountException;
import com.cts.jsld.exceptions.WithdrawException;
import com.cts.jsld.model.BankAccount;

public class BankingService {

	public void withdraw(BankAccount account, double amount) throws InvalidAmountException, WithdrawException {
		if (account != null) { //NullPointerExceptiom is avoided
			
			if(amount<0) {
				throw new InvalidAmountException("Negative amount can not be withdrawn!");
			}
			
			if(account.getBalance()<amount) {
				throw new WithdrawException("InSufficient Funds");
			}
			
			account.setBalance(account.getBalance() - amount);
		}
	}

	public void deposite(BankAccount account, double amount) throws InvalidAmountException {
		if (account != null) { //NullPointerExceptiom is avoided
			
			if(amount<0) {
				throw new InvalidAmountException("Negative amount can not be deposited!");
			}
			
			account.setBalance(account.getBalance() + amount);
		}
	}
}
