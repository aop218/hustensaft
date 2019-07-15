package menschaergerdichnicht;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class anfangsdialogGUI extends JFrame {
	private anfangsdialogDATA daten;
	
	public anfangsdialogGUI()
	{
		this.setLocation(20, 20);
		this.setSize(800,400);
		this.setTitle("Anfang");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2,2));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		panel1.setBackground(Color.BLACK);
		JLabel s1 = new JLabel("NAME SPIELER 1:");
		panel1.add(s1);
		JTextField n1 = new JTextField();
		panel1.add(n1);
		this.add(panel1);
		
		panel2.setBackground(Color.YELLOW);
		this.add(panel2);
		
		panel3.setBackground(Color.GREEN);
		this.add(panel3);
		
		panel4.setBackground(Color.RED);
		this.add(panel4);
	}
}
