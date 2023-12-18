package com.cts.jsld.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {

	private int admNo;
	private String fullName;
	private double fee;
	private LocalDate admnDate;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int admNo, String fullName, double fee, LocalDate admnDate) {
		super();
		this.admNo = admNo;
		this.fullName = fullName;
		this.fee = fee;
		this.admnDate = admnDate;
	}

	public int getAdmNo() {
		return admNo;
	}

	public void setAdmNo(int admNo) {
		this.admNo = admNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public LocalDate getAdmnDate() {
		return admnDate;
	}

	public void setAdmnDate(LocalDate admnDate) {
		this.admnDate = admnDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admNo, fee, fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return admNo == other.admNo && Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee)
				&& Objects.equals(fullName, other.fullName);
	}

	

	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", fullName=" + fullName + ", fee=" + fee + ", admnDate=" + admnDate + "]";
	}

	@Override
	public int compareTo(Student o) {
		return ((Integer)this.admNo).compareTo(o.admNo);
	}
	
	
}
