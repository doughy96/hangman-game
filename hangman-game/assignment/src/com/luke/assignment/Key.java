package com.luke.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Key extends JButton implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Key(String keyText) {

		setText(keyText);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(getText().charAt(0));
		if (e.getID() == 1001) { // 1001 is the code for mouseclick
			setVisible(false);
			int count = 0;
			
			for (int j = 0; j < Hangman.selectedWord.length(); j++) {
				if (getText().charAt(0) == Hangman.selectedWord.charAt(j)) {
					Hangman.hyphenArray[j] = Hangman.selectedWord.charAt(j);
					Window.selectedWordLabel.setText(new String(Hangman.hyphenArray));
				
					if (Window.selectedWordLabel.getText() == Hangman.selectedWord){
						System.out.println("working");
						Window.resultLabel.setText("you win!");
						Window.resultLabel.setVisible(true);
					}
				
				}
			}
			
			for (int j = 0; j < Hangman.selectedWord.length(); j++) {
				if (getText().charAt(0) != Hangman.selectedWord.charAt(j)) {
					count++;
				
					if (count == Hangman.selectedWord.length()) {
						Hangman.lives--;
						Window.livesLabel.setText("Lives: " + Hangman.lives);
						if (Hangman.lives <= 0) {
							Window.resultLabel.setVisible(true);}

					}
				}
			}

		}
	}

}