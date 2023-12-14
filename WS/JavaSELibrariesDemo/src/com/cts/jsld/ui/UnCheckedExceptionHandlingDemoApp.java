package com.cts.jsld.ui;

import java.util.Scanner;

public class UnCheckedExceptionHandlingDemoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("A Number? ");
		while(!scan.hasNextInt()) {  //this is to avoid InputTypeMisMatchException
			scan.next();
		}
		int x = scan.nextInt();;

		System.out.println("Another Number? ");
		while(!scan.hasNextInt()) {   //this is to avoid InputTypeMisMatchException 
			scan.next();
		}
		int y = scan.nextInt();
		
		if (y == 0) {   //this is to avoid ArithmeticExeption
			System.out.println("Zero can not be a divisor");
		} else {
			System.out.println(x / y);
		}
		
		System.out.println("BYE!");

		scan.close();
	}

}
