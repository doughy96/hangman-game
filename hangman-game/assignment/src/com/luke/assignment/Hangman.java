package com.luke.assignment;

import java.util.Random;

public class Hangman {

	public static char[] hyphenArray;
	public static String selectedWord;
	public static Window window = null;
	String letters = "AEIOUYBCDFGHJKLMNPRSTVWXZ";
	public Key[] keys = new Key[26];
	public static int lives = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman hangman = new Hangman();
		System.out.print(Hangman.selectedWord);
	}

	public Hangman() {
		window = new Window("Hangman");
		Dictionary dictionary = new Dictionary("C:/Users/Luke/Documents/dictionary.txt");
		Random random = new Random();
		int rnd = random.nextInt(dictionary.listOfWords.size());
		selectedWord = dictionary.getWordAt(rnd);
	    hyphenArray = new char[selectedWord.length()];
		String arrayAsString = "";
		for (int i = 0; i < hyphenArray.length; i++) {
			hyphenArray[i] = '-';
			arrayAsString += hyphenArray[i];
		}
		window.selectedWordLabel.setText(arrayAsString);
		for (int i = 0; i < letters.length(); i++) {
			keys[i] = new Key("" + letters.charAt(i));
			Window.keyboard.add(keys[i]);
		}
	}
}


//need to make a new array of words only 

