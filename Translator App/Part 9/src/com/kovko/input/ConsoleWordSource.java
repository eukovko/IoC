package com.kovko.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleWordSource implements WordSource {

	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			if (line.equalsIgnoreCase("done")) {
				break;
			}
			words.add(line);
		}
		return words;
	}
}
