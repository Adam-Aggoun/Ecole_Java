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

public class Ajout_compte {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajout_compte window = new Ajout_compte();
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
	public Ajout_compte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 778, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajout de compte");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(285, 21, 171, 63);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(268, 95, 188, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 147, 188, 41);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 210, 188, 41);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 262, 188, 41);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(131, 95, 101, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(316, 325, 101, 34);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Connexion connect = new Connexion();
					Connection cnx = connect.dbConnection();
					try {
						String requete = "INSERT INTO compte (Nom, Prenom, Email, Classe, Mdp, Rôle) VALUES ('"+textField.getText()+"', '"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_4.getText()+"', '"+textField_3.getText()+"','"+textField_5.getText()+"')";
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
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.setBounds(518, 325, 101, 34);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Admin window = new Admin();
				window.frame.setVisible(true);
				frame.dispose();

			}
		});
		JLabel lblNewLabel_1_1 = new JLabel("Prenom");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(131, 147, 101, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(131, 210, 101, 41);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mdp");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(131, 262, 101, 41);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(562, 112, 143, 41);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Role");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(495, 208, 101, 41);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(562, 210, 143, 41);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Classe");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4_1.setBounds(495, 110, 101, 41);
		frame.getContentPane().add(lblNewLabel_1_4_1);
	}
}
