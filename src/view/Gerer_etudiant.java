package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JTextField;

import com.dbconnection.Connexion;

import javax.swing.JButton;
import java.awt.Color;

public class Gerer_etudiant {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerer_etudiant window = new Gerer_etudiant();
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
	public Gerer_etudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 689, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion Etudiant");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(264, 30, 161, 49);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 97, 137, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 145, 137, 38);
		frame.getContentPane().add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(383, 97, 137, 38);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(288, 298, 137, 31);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connexion connect = new Connexion();
				Connection cnx = connect.dbConnection();
				try {
					String requete = "update eleve set nom='"+textField.getText()+"',Prenom='"+textField_1.getText()+"', Classe='"+textField_4.getText()+"' where nom='"+textField.getText()+"' ";
					connect.Requete_prepare(cnx, requete);
					System.out.println(requete);
					frame.dispose();
					Admin window = new Admin();
					window.frame.setVisible(true);
				} 
				catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 103, 61, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenom");
		lblNewLabel_1_1.setBounds(10, 145, 61, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Classe");
		lblNewLabel_1_3.setBounds(312, 109, 61, 26);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(516, 298, 116, 42);
		frame.getContentPane().add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Admin window = new Admin();
			window.frame.setVisible(true);
			frame.dispose();

		}
	});
	}

}
