package com.cts.jsld.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.jsld.model.Student;

public class DeSerilizationDemoApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		final String filename = "students.data";
		
		try(ObjectInputStream fin = new ObjectInputStream(new FileInputStream(filename))){
			List<Student> students = (List<Student>) fin.readObject();
			students.stream().forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
