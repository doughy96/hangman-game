package com.luke.assignment;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Window extends JFrame {
	JPanel panel;
	 public JLabel selectedWordLabel;

	public Window(String title) {
		super(title);
		setSize(150, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		selectedWordLabel = new JLabel("thelabel");
		add(selectedWordLabel);
		setVisible(true);
	}
}