package com.cts.jsld.service;

public class Swapper<T> {
	public void swap(T a, T b) {
		System.out.println("Before Swap: " + a + "\t" + b);
		T temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap: " + a + "\t" + b);
	}
}