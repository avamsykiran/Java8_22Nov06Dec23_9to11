package com.cts.jsld.service;

import java.util.Comparator;

import com.cts.jsld.model.Student;

public class StudentComparatorBasedOnName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}
	

}
