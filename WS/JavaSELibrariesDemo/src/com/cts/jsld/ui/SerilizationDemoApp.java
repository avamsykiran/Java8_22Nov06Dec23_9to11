package com.cts.jsld.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cts.jsld.model.Student;

public class SerilizationDemoApp {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(201, "Vamsy", 12500, LocalDate.now()));
		students.add(new Student(101, "Arun", 22500, LocalDate.now().minusMonths(2)));
		students.add(new Student(110, "Zeenath", 1500, LocalDate.now().minusYears(1)));
		students.add(new Student(107, "Sravan", 10500, LocalDate.now().minusMonths(4)));
		students.add(new Student(103, "Bavya", 22500, LocalDate.now().minusMonths(4)));
		students.add(new Student(111, "David", 13500, LocalDate.now().minusMonths(5)));
		students.add(new Student(107, "Chakri", 15500, LocalDate.now().minusMonths(1)));
		students.add(new Student(202, "Xavier", 19500, LocalDate.now().minusDays(15)));
		students.add(new Student(200, "Rahul", 10000, LocalDate.now().minusDays(7)));

		final String filename = "students.data";
		
		try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(filename))){
			fout.writeObject(students);
			System.out.println("File Saved");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
