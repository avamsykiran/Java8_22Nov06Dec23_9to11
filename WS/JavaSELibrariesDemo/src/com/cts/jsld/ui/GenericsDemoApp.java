package com.cts.jsld.ui;

import com.cts.jsld.model.BankAccount;
import com.cts.jsld.service.Swapper;

public class GenericsDemoApp {
	public static void main(String a[]) {

		Swapper<String> s1 = new Swapper<>();
		s1.swap("Hello ", "Hai ");

		Swapper<Integer> s2 = new Swapper<>();
		s2.swap(100, 200);
		
		Swapper<BankAccount> s3 = new Swapper<>();
		s3.swap(new BankAccount(123,56000),new BankAccount(456,89000));

	}
}