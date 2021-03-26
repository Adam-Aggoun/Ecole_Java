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

public class profil {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profil window = new profil();
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
	public profil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 551, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modification Profil");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(191, 11, 145, 55);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(175, 66, 161, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 106, 161, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 146, 161, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 186, 161, 29);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(39, 66, 69, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenom");
		lblNewLabel_1_1.setBounds(39, 113, 69, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setBounds(39, 153, 69, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mdp");
		lblNewLabel_1_3.setBounds(39, 193, 69, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(191, 254, 108, 36);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connexion connect = new Connexion();
				Connection cnx = connect.dbConnection();
				try {
					String requete = "update compte set nom='"+textField.getText()+"',Prenom='"+textField_1.getText()+"',Email='"+textField_2.getText()+"', Mdp='"+textField_3.getText()+"' where nom='"+textField.getText()+"' ";
					connect.Requete_prepare(cnx, requete);
					System.out.println(requete);
					frame.dispose();
					professeur window = new professeur();
					window.frame.setVisible(true);
				} 
				catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
				
			}
		});
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(368, 254, 108, 36);
		frame.getContentPane().add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				professeur window = new professeur();
				window.frame.setVisible(true);
				frame.dispose();

			}
		});
	}

}
