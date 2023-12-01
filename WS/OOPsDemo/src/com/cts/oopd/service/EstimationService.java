package com.cts.oopd.service;

import com.cts.oopd.model.AdBoard;

public class EstimationService {

	private double paintingRate;
	private double borderRate;
	
	public EstimationService(double paintingRate, double borderRate) {
		super();
		this.paintingRate = paintingRate;
		this.borderRate = borderRate;
	}
	
	public double estiamtePaintingCost(AdBoard b) {
		return b.getArea()*this.paintingRate;
	}
	
	public double estiamteBorderCost(AdBoard b) {
		return b.getPerimeter()*this.borderRate;
	}
}
