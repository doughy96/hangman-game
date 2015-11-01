package com.luke.assignment;

public class Hangman {

	public static char[] hyphenArray;
	public static String selectedWord;
	public static Window window = null;
	String letters = "aeiouybcdfghjklmnpqrstvwxz";
	public Key[] keys = new Key[26];
	public static int lives = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman hangman = new Hangman();
		System.out.print(Hangman.selectedWord);
	}

	public Hangman() {
		
		window = new Window("Hangman");
		
		
		for (int i = 0; i < letters.length(); i++) {
			keys[i] = new Key("" + letters.charAt(i));
			Window.keyboard.add(keys[i]);
		}
			window.add(Window.keyboard);
			System.out.println("added keyboard");
		Dictionary dictionary = new Dictionary(getClass().getResourceAsStream("/dictionary.txt"));
		//Dictionary dictionary = new Dictionary("C:/Users/Luke/Documents/dictionary.txt");
		selectedWord = dictionary.randomWord;
		hyphenArray = new char[selectedWord.length()];
		String arrayAsString = "";
		for (int i = 0; i < hyphenArray.length; i++) {
			hyphenArray[i] = '-';
			arrayAsString += hyphenArray[i];
		}
		
		Window.selectedWordLabel.setText(arrayAsString);
		
		System.out.println(Window.selectedWordLabel.getText());
	
	}
}


