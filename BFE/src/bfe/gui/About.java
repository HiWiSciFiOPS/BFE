package bfe.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import bfe.logic.Main;

public class About {
	
	public static About instance;
	
	private JFrame frame;
	private static final int width = 300;
	private static final int height = 500;
	
	private final String aboutString = "Brainfuck Editor version \"" + Main.VERSION + "\"\r\n"
			+ "License: CC BY-NC-ND\r\n"
			+ "by Max Hager\r\n"
			+ "More information at https://creativecommons.org/licenses/by-nc-nd/4.0/legalcode\r\n"
			+ "This project has been made and distributed as part of a school task during the IT lesson.\r\n"
			+ "This program is not going to be ported to other platforms or another programming language by the original author.";
	
	public About() {
		if (instance == null) {
			instance = this;
		} else {
			return;
		}
		frame = new JFrame("About");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setResizable(false);
		Point screenCenter = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		frame.setLocation(screenCenter.x - (width/2), screenCenter.y - (height/2));
		frame.setSize(width, height);
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout());
		
		JTextArea jta = new JTextArea();
		jta.setEditable(false);
		jta.setText(aboutString);
		panel.add(jta);
		
		frame.pack();
	}
	
	public void Show() {
		if (frame.isVisible()) {
			frame.toFront();
			frame.requestFocus();
		} else {
			frame.setVisible(true);
		}
	}
}
