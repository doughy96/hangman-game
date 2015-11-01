package com.luke.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

class Dictionary {

	public String randomWord = null;

	BufferedReader file = null;
	String tempCurrentLine = null;

	public Dictionary(InputStream inputStream) {

		Random random = new Random();
		int count = 0;

		try {
			file = new BufferedReader(new InputStreamReader(inputStream));
			while ((file.readLine()) != null) {
				count++;
			}

			int rnd = random.nextInt(count);
			count = 0; // reset
			file.close(); // reset
			file = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("line chosen" + rnd);

			try {
				while ((tempCurrentLine = file.readLine()) != null) {
					count++;
					if (count == rnd) {
						randomWord = tempCurrentLine;
					}
				}
			} catch (IOException e) {
				System.out.println("error");
			}
			file.close();

		} catch (IOException e) {
			System.out.print("failed to choose line");
		}
	}
}
