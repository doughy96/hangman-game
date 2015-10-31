package com.luke.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Dictionary {

	BufferedReader file = null;
	String tempCurrentLine = null;
	public List<String> listOfWords = new ArrayList<String>();

	public Dictionary(String filepath) {
     try{file = new BufferedReader(new FileReader(filepath));
          while ((tempCurrentLine = file.readLine()) != null) {
				listOfWords.add(tempCurrentLine);
		  }

    }catch (IOException e) {
			System.out.print("failed to count #letters in file");
	}
				 }

	public String getWordAt(int x) {
		return listOfWords.get(x);
	}
	
}