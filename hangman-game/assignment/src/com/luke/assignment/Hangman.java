package com.luke.assignment;

import java.util.Random;

public class Hangman {

	public String selectedWord;
	Window window = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman hangman = new Hangman();
	
		System.out.print(hangman.selectedWord);
	}

	public Hangman() {
		window = new Window("Hangman");
		Dictionary dictionary = new Dictionary("C:/Users/Luke/Documents/dictionary.txt");
		Random random = new Random();
		int rnd = random.nextInt(dictionary.listOfWords.size());
		selectedWord = dictionary.getWordAt(rnd);
		char[] hyphenArray = new char[selectedWord.length()];
		String arrayAsString = "";
		for (int i = 0; i < hyphenArray.length; i++) {
		hyphenArray[i] = '-';
		arrayAsString += hyphenArray[i];}
		window.selectedWordLabel.setText(arrayAsString);
		

	}

}





  
 
 
