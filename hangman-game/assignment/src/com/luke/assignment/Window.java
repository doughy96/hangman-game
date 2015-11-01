package com.luke.assignment;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Window extends JFrame {
	JPanel panel;
	public static JLabel selectedWordLabel;
	public JLabel guessText;
	public static JPanel keyboard = new JPanel();
	public static JLabel livesLabel;
	public static  JLabel resultLabel;

	public Window(String title) {
		
		super(title);
		setSize(1200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		selectedWordLabel = new JLabel("didntloadfromhyphenarray");
		selectedWordLabel.setFont(new Font("Serif", Font.BOLD, 40));
		guessText = new JLabel("select letters to guess the word");
		livesLabel = new JLabel("Lives: " + Hangman.lives);
		resultLabel = new JLabel("sorry, you lost");
		resultLabel.setVisible(false);
		keyboard.setBackground( Color.red );
		
		add(selectedWordLabel);
		add(guessText);
		add(livesLabel);
		add(resultLabel);
		setVisible(true);
		

	}
}

