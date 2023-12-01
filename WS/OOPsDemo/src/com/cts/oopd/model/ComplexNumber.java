package com.cts.oopd.model;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(imaginary, real);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplexNumber other = (ComplexNumber) obj;
		return imaginary == other.imaginary && real == other.real;
	}

	
}
