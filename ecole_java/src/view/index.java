package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class index {

	 JFrame frame1;
	protected Object index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 726, 364);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		
		
		
		JButton Inscription = new JButton("Inscription");
		Inscription.setBounds(64, 170, 172, 35);
		frame1.getContentPane().add(Inscription);
		Inscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame1.dispose();
				Inscription window = new Inscription();
				 window.Inscription.setVisible(true);
			}
		});
		
		JButton Connexion = new JButton("Connexion");
		Connexion.setBounds(453, 170, 177, 35);
		frame1.getContentPane().add(Connexion);
		Connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame1.dispose();
				 page_connexion window = new page_connexion();
				 window.connexion.setVisible(true);
			}
		});
		
	}
}