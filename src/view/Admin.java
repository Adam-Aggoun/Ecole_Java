package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Admin {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 691, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vue admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(265, 30, 161, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ajouter Classe\r\n");
		btnNewButton.setBounds(244, 117, 137, 42);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Classe window = new Classe();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnAjouterEtudiant = new JButton("Ajouter Etudiant");
		btnAjouterEtudiant.setBounds(244, 195, 137, 42);
		frame.getContentPane().add(btnAjouterEtudiant);
		btnAjouterEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Etudiant window = new Etudiant();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnGererEtudiant = new JButton("Gerer Etudiant");
		btnGererEtudiant.setBounds(244, 277, 137, 42);
		frame.getContentPane().add(btnGererEtudiant);
		btnGererEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Gerer_etudiant window = new Gerer_etudiant();
				window.frame.setVisible(true);
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Deconnexion");
		btnNewButton_1.setBounds(530, 366, 124, 42);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_connexion  window = new page_connexion ();
				window.connexion.setVisible(true);
				
			}
		});
		
		JButton btnAjouterCompte = new JButton("Ajouter Compte\r\n");
		btnAjouterCompte.setBounds(448, 117, 137, 42);
		frame.getContentPane().add(btnAjouterCompte);
		btnAjouterCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Ajout_compte window = new Ajout_compte();
				window.frame.setVisible(true);
				
			}
		});
	}
}
