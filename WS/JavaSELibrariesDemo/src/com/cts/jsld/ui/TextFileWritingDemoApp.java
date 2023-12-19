package com.cts.jsld.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileWritingDemoApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("FileName? ");
		String filename = scan.nextLine();

		List<String> lines = new ArrayList<>();
		String line = null;
		System.out.println("Type the file context and '***' to stop: ");
		while (!"***".equals(line)) {
			line = scan.nextLine();
			if (!"***".equals(line)) {
				lines.add(line);
			}
		}

		Path filePath = Paths.get(filename);
		try {
			Files.write(filePath, lines);
			System.out.println("File Saved!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
