package com.cts.oopd.model;

public class Employee {

	public static final double tds=0.10; 
	
	private int empId;
	private String fullName;
	private double basic;
	
	public Employee() {
		
	}

	public Employee(int empId, String fullName, double basic) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.basic = basic;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double netPay() {
		return this.basic - (this.basic*tds);
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", basic=" + basic + ", netPay="+netPay();
	}
	

}
