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
			for (int j = 0; j < Hangman.selectedWord.length(); j++) {
				if (getText().toLowerCase().charAt(0) == Hangman.selectedWord.charAt(j)) {
					Hangman.hyphenArray[j] = Hangman.selectedWord.charAt(j);
					Window.selectedWordLabel.setText(new String(Hangman.hyphenArray));
				
				} else {

					Window.livesLabel.setText("Lives: " + Hangman.lives--);
				}
			}
		}
	}
}
