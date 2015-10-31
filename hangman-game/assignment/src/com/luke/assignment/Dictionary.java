package com.luke.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Dictionary {

	public String randomWord = null;

	BufferedReader file = null;
	String tempCurrentLine = null;

	public Dictionary(String filepath) {

		Random random = new Random();
		int count = 0;
		try {
			file = new BufferedReader(new FileReader(filepath));
			while ((file.readLine()) != null) {

				count++;
			}

			int rnd = random.nextInt(count);
			count = 0;
			file.close();
			file = new BufferedReader(new FileReader(filepath));
			System.out.println(rnd);
			while ((tempCurrentLine = file.readLine()) != null) {
				count++;
				if (count == rnd) {
					randomWord = tempCurrentLine;
					System.out.println("madeitthisfar");
				}
			}
			file.close();
		} catch (IOException e) {
			System.out.print("failed to count #letters in file");
		}
	}

}