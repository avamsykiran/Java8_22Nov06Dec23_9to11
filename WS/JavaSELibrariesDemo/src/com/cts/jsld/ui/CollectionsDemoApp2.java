package com.cts.jsld.ui;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.cts.jsld.model.Student;
import com.cts.jsld.service.StudentComparatorBasedOnName;

public class CollectionsDemoApp2 {
	public static void main(String a[]) {
		//Set<Student> students = new HashSet<>();
		//Set<Student> students = new LinkedHashSet<>();
		//Set<Student> students = new TreeSet<>();
//		Set<Student> students = new TreeSet<>(new StudentComparatorBasedOnName());
		Set<Student> students = new TreeSet<>((s1,s2) -> s1.getAdmnDate().compareTo(s2.getAdmnDate()));
	
		students.add(new Student(201, "Vamsy", 12500, LocalDate.now()));
		students.add(new Student(101, "Arun", 22500, LocalDate.now().minusMonths(2)));
		students.add(new Student(110, "Zeenath", 1500, LocalDate.now().minusYears(1)));
		students.add(new Student(107, "Sravan", 10500, LocalDate.now().minusMonths(4)));
		students.add(new Student(103, "Bavya", 22500, LocalDate.now().minusMonths(4)));
		students.add(new Student(111, "David", 13500, LocalDate.now().minusMonths(5)));
		students.add(new Student(107, "Chakri", 15500, LocalDate.now().minusMonths(1)));
		students.add(new Student(202, "Xavier", 19500, LocalDate.now().minusDays(15)));
		students.add(new Student(200, "Rahul", 10000, LocalDate.now().minusDays(7)));

		for(Student s:students) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------------------------------");
		
	}
}
