package com.cts.oopd.model;

public class ContractEmployee extends Employee {

	private int contractDuration;
	
	public ContractEmployee() {
		
	}

	public ContractEmployee(int empId, String fullName, double basic, int contractDuration) {
		super(empId, fullName, basic);
		this.contractDuration = contractDuration;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return  super.toString() + ", contractDuration=" + contractDuration;
	}
	
	
}
