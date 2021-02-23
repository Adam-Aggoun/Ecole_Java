package view;

import com.dbconnection.*;
import global_variable.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Inscription {
	Statement statement = null;
	JFrame Inscription;
	private JTextField Text_Nom;
	private JTextField Text_Prenom;
	private JTextField Text_Mpd;
	private JTextField Text_Email;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription window = new Inscription();
					window.Inscription.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inscription() {
		initialize();
	}

	/**
	 * Initialize the contents of the Inscription.
	 */
	private void initialize() {
		Inscription = new JFrame();
		Inscription.setBounds(100, 100, 396, 339);
		Inscription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Inscription.getContentPane().setLayout(null);


		

		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setBounds(10, 34, 49, 14);
		Inscription.getContentPane().add(lblNewLabel);

		Text_Nom = new JTextField();
		Text_Nom.setBounds(229, 31, 128, 20);
		Inscription.getContentPane().add(Text_Nom);
		Text_Nom.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setBounds(10, 76, 49, 14);
		Inscription.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Mot de passe");
		lblNewLabel_3.setBounds(10, 162, 139, 14);
		Inscription.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_5 = new JLabel("Classe");
		lblNewLabel_5.setBounds(10, 208, 49, 14);
		Inscription.getContentPane().add(lblNewLabel_5);

		Text_Prenom = new JTextField();
		Text_Prenom.setBounds(229, 73, 128, 20);
		Inscription.getContentPane().add(Text_Prenom);
		Text_Prenom.setColumns(10);

		Text_Mpd = new JTextField();
		Text_Mpd.setBounds(229, 159, 128, 20);
		Inscription.getContentPane().add(Text_Mpd);
		Text_Mpd.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Classe", "STI2D", "CPRP", "SLAM", "SISR"}));
		comboBox.setBounds(229, 204, 128, 22);
		Inscription.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {     
			public void actionPerformed(ActionEvent e) {

			}
		});



		Text_Email = new JTextField();
		Text_Email.setBounds(229, 121, 128, 20);
		Inscription.getContentPane().add(Text_Email);
		Text_Email.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(10, 124, 49, 14);
		Inscription.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Inscription");
		btnNewButton.setBounds(105, 249, 168, 23);
		Inscription.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Connexion connect = new Connexion();
				Connection cnx = connect.dbConnection();
				try {
					String requete = "INSERT INTO compte (Nom, Prenom, Email, Classe, Mdp) VALUES ('"+Text_Nom.getText()+"', '"+Text_Prenom.getText()+"','"+Text_Email.getText()+"','"+comboBox.getSelectedItem().toString()+", '"+Text_Mpd.getText()+"')'";
					connect.Requete_prepare(cnx, requete);
					System.out.println(requete);
				} 
				catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
			}
		});


	}	
}