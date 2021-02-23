package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class index {

	private JFrame frame;
	protected Object index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JButton Inscription = new JButton("Inscription");
		Inscription.setBounds(64, 170, 172, 35);
		frame.getContentPane().add(Inscription);
		Inscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				Inscription window = new Inscription();
				 window.Inscription.setVisible(true);
			}
		});
		
		JButton Connexion = new JButton("Connexion");
		Connexion.setBounds(453, 170, 177, 35);
		frame.getContentPane().add(Connexion);
		Connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				 page_connexion window = new page_connexion();
				 window.connexion.setVisible(true);
			}
		});
		
	}
}