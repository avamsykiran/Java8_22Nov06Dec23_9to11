package com.cts.jsld.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TextFileReadingDemoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("FileName? ");
		String filename = scan.nextLine();

		Path filePath = Paths.get(filename);
		try {
			List<String> lines = Files.readAllLines(filePath);
			lines.stream().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("No Such File Found");
		}
		scan.close();

	}

}
