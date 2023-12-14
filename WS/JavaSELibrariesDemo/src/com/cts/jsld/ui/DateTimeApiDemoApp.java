package com.cts.jsld.ui;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeApiDemoApp {

	public static void main(String[] args) {
		
		LocalTime startTime = LocalTime.now();
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		ZonedDateTime nowInNY = ZonedDateTime.now(ZoneId.of("GMT-5"));
		System.out.println(nowInNY);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(today.format(formatter));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Date Of Birth (dd-MMM-yyyy): ");
		String dobStr = scan.next();
		LocalDate dob = LocalDate.parse(dobStr, formatter);
		
		Period age = Period.between(dob, today);
		System.out.println("Your age exactly is: " + age);
		
		LocalTime endTime = LocalTime.now();
		Duration progExecDuration = Duration.between(startTime, endTime);
		System.out.println("It took "+progExecDuration+" to execute this program!");
		scan.close();
	}

}
