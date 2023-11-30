package com.cts.oopd.model;

public class Manager extends Employee {

	private double allowence;
	
	public Manager(){
		
	}

	public Manager(int empId, String fullName, double basic, double allowence) {
		super(empId, fullName, basic);
		this.allowence = allowence;
	}

	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}

	@Override
	public double netPay() {
		double gross =this.getBasic() + this.allowence; 
		return gross - (gross*tds);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", allowence=" + allowence;
	}
	
}
