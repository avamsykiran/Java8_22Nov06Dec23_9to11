package com.cts.oopd.model;

public class RectangularBoard implements AdBoard {

	private int length;
	private int breadth;
	
	public RectangularBoard(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+breadth);
	}

}
