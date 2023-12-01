package com.cts.oopd.model;

public class CircularBoard implements AdBoard {

	public double radius;
	
	public CircularBoard(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*PI*radius;
	}

}
