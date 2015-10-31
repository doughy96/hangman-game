package com.luke.assignment;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Window extends JFrame {
	JPanel panel;
	public static JLabel selectedWordLabel;
	public JLabel guessText;
	public static JPanel keyboard = new JPanel();
	public static JLabel livesLabel;

	public Window(String title) {
		super(title);
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		selectedWordLabel = new JLabel("didntloadfromhyphenarray");
		guessText = new JLabel("select letters to guess the word");
		livesLabel = new JLabel("Lives: " + Hangman.lives);
		add(selectedWordLabel);
		add(guessText);
		add(keyboard);
		add(livesLabel);
		setVisible(true);

	}
}

//by typing in a box the word or by completing the word with buttons can you win.