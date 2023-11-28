package com.cts.oopd.app;

import com.cts.oopd.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber();
		c1.setReal(45);
		c1.setImaginary(8);
		System.out.println(c1.getReal() + "\t" +c1.getImaginary());
		
		ComplexNumber c2 = new ComplexNumber(10,-15);
		System.out.println(c2.getReal() + "\t" +c2.getImaginary());
		
		ComplexNumber c3 = new ComplexNumber();
		System.out.println(c3.getReal() + "\t" +c3.getImaginary());
		
		ComplexNumber c4 = new ComplexNumber(c1);
		System.out.println(c4.getReal() + "\t" +c4.getImaginary());
		
		ComplexNumber c5 = c2;
		System.out.println(c5.getReal() + "\t" +c5.getImaginary());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c4));
		System.out.println(c5.equals(c2));
		
	}

}
