package com.cts.oopd.app;

import com.cts.oopd.model.CircularBoard;
import com.cts.oopd.model.RectangularBoard;
import com.cts.oopd.service.EstimationService;

public class AbstractionDemoApp {

	public static void main(String[] args) {
		
		EstimationService es = new EstimationService(10.0,2.0);
		
		RectangularBoard rb = new RectangularBoard(10,10);
		CircularBoard cb = new CircularBoard(10.0);
		
		System.out.println(es.estiamtePaintingCost(rb));
		System.out.println(es.estiamtePaintingCost(cb));

		System.out.println(es.estiamteBorderCost(rb));
		System.out.println(es.estiamteBorderCost(cb));
	}

}
