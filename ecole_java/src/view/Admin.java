package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
		frame.setBounds(100, 100, 691, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vue admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(265, 30, 161, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ajouter Classe\r\n");
		btnNewButton.setBounds(244, 108, 137, 42);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Classe window = new Classe();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnAjouterEtudiant = new JButton("Ajouter Etudiant");
		btnAjouterEtudiant.setBounds(244, 171, 137, 51);
		frame.getContentPane().add(btnAjouterEtudiant);
		btnAjouterEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Etudiant window = new Etudiant();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnGererEtudiant = new JButton("Gerer Etudiant");
		btnGererEtudiant.setBounds(244, 252, 137, 42);
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
		
		JButton btnNewButton_2 = new JButton("Ajouter prof\r\n");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(398, 171, 161, 51);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Ajouter professeur principal\r\n");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2_1.setBounds(58, 171, 169, 51);
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_connexion window = new page_connexion();
				window.connexion.setVisible(true);
				
			}
		});
	}
}
