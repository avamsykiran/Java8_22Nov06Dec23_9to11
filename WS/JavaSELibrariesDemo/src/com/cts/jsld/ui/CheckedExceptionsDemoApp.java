package com.cts.jsld.ui;

import java.util.Scanner;

import com.cts.jsld.exceptions.InvalidAmountException;
import com.cts.jsld.exceptions.WithdrawException;
import com.cts.jsld.model.BankAccount;
import com.cts.jsld.service.BankingService;

public class CheckedExceptionsDemoApp {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(12345, 1900.0);
		BankingService bankingService = new BankingService();
		Scanner scan = new Scanner(System.in);

		String cmd = "";

		while (!"quit".equalsIgnoreCase(cmd)) {
			System.out.println("Command (diposite/withdraw/quit): ");
			cmd = scan.next();

			switch (cmd.toLowerCase()) {
			case "diposite":
				System.out.println("Amount? ");
				while(!scan.hasNextDouble()) {//check if the given input is a valid double
					scan.next(); //if not valid double skip that value and accept again to avoid InputTypeMisMatchException
				}
				double depositAmount = scan.nextDouble();
				try {
					bankingService.deposite(account, depositAmount);
					System.out.println(depositAmount + " is deposited! \n " + account);
				} catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "withdraw":
				System.out.println("Amount? ");
				while(!scan.hasNextDouble()) {
					scan.next();
				}
				double withdrawAmount = scan.nextDouble();
				try {
					bankingService.withdraw(account, withdrawAmount);
					System.out.println(withdrawAmount + " is withdrawn! \n " + account);
				} catch (InvalidAmountException | WithdrawException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit":
				System.out.println("BYE!");
				break;
			default:
				System.out.println("Unknown Command!");
				break;
			}
		}
		scan.close();
	}

}
