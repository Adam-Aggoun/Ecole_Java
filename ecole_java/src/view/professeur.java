package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class professeur {

 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					professeur window = new professeur();
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
	public professeur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 736, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Professeur ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(314, 25, 205, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Planning\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				planning window = new planning();
				window.planning.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(300, 114, 136, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRendezvous = new JButton("Rendez-vous\r\n");
		btnRendezvous.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRendezvous.setBounds(300, 216, 136, 38);
		frame.getContentPane().add(btnRendezvous);
		btnRendezvous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				rdv window = new rdv();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnGestion = new JButton("Gestion des classes");
		btnGestion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGestion.setBounds(285, 315, 169, 38);
		frame.getContentPane().add(btnGestion);
		btnGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gestion window = new gestion();
				window.frame.setVisible(true);
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Deconnexion");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(555, 394, 136, 38);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_connexion window = new page_connexion ();
				window.connexion.setVisible(true);
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("Modifier profil");
		btnNewButton_2.setBounds(47, 116, 136, 38);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				profil window = new profil ();
				window.frame.setVisible(true);
				
			}
		});
		
	}
}
