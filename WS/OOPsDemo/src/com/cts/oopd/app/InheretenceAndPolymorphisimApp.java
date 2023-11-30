package com.cts.oopd.app;

import com.cts.oopd.model.ContractEmployee;
import com.cts.oopd.model.Employee;
import com.cts.oopd.model.Manager;

public class InheretenceAndPolymorphisimApp {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Vamsy",45000.0);
		Manager mgr = new Manager(102, "Suseela",67800.0, 7800.0);
		ContractEmployee cemp = new ContractEmployee(301, "Sagar", 55000.0, 10);
		
		System.out.println(emp);
		System.out.println(mgr);
		System.out.println(cemp);
	}

}
