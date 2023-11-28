package com.cts.oopd.model;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber() {
		this(1,1);
	}

	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public ComplexNumber(ComplexNumber c) {
		this(c.real,c.imaginary);
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		//return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
		return real + (imaginary>=0? "+i"+imaginary : "-i"+(-imaginary));
	}

	
}
