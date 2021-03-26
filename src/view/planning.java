package view;
import com.dbconnection.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;

import global_variable.global;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class planning extends global {

	JFrame planning;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planning window = new planning();
					window.planning.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public planning() {
		initialize();
	}

	/**
	 * Initialize the contents of the planning.
	 */
	private void initialize() {
		planning = new JFrame();
		planning.getContentPane().setBackground(new Color(60, 179, 113));
		planning.setBounds(100, 100, 872, 546);
		planning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		planning.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Planning de "+nom_prof);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(336, 30, 199, 50);
		planning.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1_4 = new JLabel("Date :\r\n");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(27, 104, 55, 25);
		planning.getContentPane().add(lblNewLabel_1_4);

		JLabel Classe = new JLabel("Classe");
		Classe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Classe.setBounds(27, 174, 84, 32);
		planning.getContentPane().add(Classe);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRetour.setBounds(10, 456, 156, 42);
		planning.getContentPane().add(btnRetour);

		JTextArea Classe1 = new JTextArea();
		Classe1.setEditable(false);
		Classe1.setBounds(121, 182, 84, 22);
		planning.getContentPane().add(Classe1);
		
		JLabel Heure = new JLabel("Heure");
		Heure.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure.setBounds(368, 174, 84, 32);
		planning.getContentPane().add(Heure);
		
		JTextArea Heure1 = new JTextArea();
		Heure1.setEditable(false);
		Heure1.setBounds(451, 182, 108, 22);
		planning.getContentPane().add(Heure1);
		
		JLabel Classe_1 = new JLabel("Classe");
		Classe_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Classe_1.setBounds(27, 236, 84, 32);
		planning.getContentPane().add(Classe_1);
		
		JTextArea Classe2 = new JTextArea();
		Classe2.setEditable(false);
		Classe2.setBounds(121, 244, 84, 22);
		planning.getContentPane().add(Classe2);
		
		JLabel Heure_1 = new JLabel("Heure");
		Heure_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_1.setBounds(368, 236, 84, 32);
		planning.getContentPane().add(Heure_1);
		
		JTextArea Heure2 = new JTextArea();
		Heure2.setEditable(false);
		Heure2.setBounds(451, 244, 108, 22);
		planning.getContentPane().add(Heure2);
		
		JLabel Classe_2 = new JLabel("Classe");
		Classe_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Classe_2.setBounds(27, 294, 84, 32);
		planning.getContentPane().add(Classe_2);
		
		JTextArea Classe3 = new JTextArea();
		Classe3.setEditable(false);
		Classe3.setBounds(121, 302, 84, 22);
		planning.getContentPane().add(Classe3);
		
		JLabel Heure_1_1 = new JLabel("Heure");
		Heure_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_1_1.setBounds(368, 294, 84, 32);
		planning.getContentPane().add(Heure_1_1);
		
		JTextArea Heure3 = new JTextArea();
		Heure3.setEditable(false);
		Heure3.setBounds(451, 302, 108, 22);
		planning.getContentPane().add(Heure3);
		
		JLabel Classe_3 = new JLabel("Classe");
		Classe_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Classe_3.setBounds(27, 355, 84, 32);
		planning.getContentPane().add(Classe_3);
		
		JTextArea Classe4 = new JTextArea();
		Classe4.setEditable(false);
		Classe4.setBounds(121, 363, 84, 22);
		planning.getContentPane().add(Classe4);
		
		JLabel Heure_1_1_1 = new JLabel("Heure");
		Heure_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_1_1_1.setBounds(368, 355, 84, 32);
		planning.getContentPane().add(Heure_1_1_1);
		
		JTextArea Heure4 = new JTextArea();
		Heure4.setEditable(false);
		Heure4.setBounds(451, 363, 108, 22);
		planning.getContentPane().add(Heure4);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(94, 104, 111, 26);
		planning.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		btnRetour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				professeur window = new professeur();
				window.frame.setVisible(true);
				planning.dispose();

			}
		});
		try {
			Connexion connect = new Connexion();
			Connection cnx = connect.dbConnection();
			Statement st;
			ResultSet rst;
			
			String retourLigne = System.getProperty("line.separator");
			
			
			st =cnx.createStatement();
			rst= st.executeQuery("Select * from cours Where Nom = '"+nom_prof +"'");
			
			while(rst.next()) {
				Classe1.setText(rst.getString("Classe")+ retourLigne);
				Heure1.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				Classe2.setText(rst.getString("Classe")+ retourLigne);
				Heure2.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				Classe3.setText(rst.getString("Classe")+ retourLigne);
				Heure3.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				Classe4.setText(rst.getString("Classe")+ retourLigne);
				Heure4.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
			}
		}catch(Exception ex) {
			
		}
		
	}
}

