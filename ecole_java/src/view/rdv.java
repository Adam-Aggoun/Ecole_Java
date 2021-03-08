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

public class rdv extends global {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rdv window = new rdv();
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
	public rdv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 780, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rendez-vous de "+nom_prof);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(273, 11, 198, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Eleve = new JLabel("El\u00E8ve");
		Eleve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Eleve.setBounds(36, 98, 84, 32);
		frame.getContentPane().add(Eleve);
		
		JLabel lblElve = new JLabel("El\u00E8ve");
		lblElve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblElve.setBounds(36, 162, 84, 32);
		frame.getContentPane().add(lblElve);
		
		JLabel lblElve_1 = new JLabel("El\u00E8ve");
		lblElve_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblElve_1.setBounds(36, 234, 84, 32);
		frame.getContentPane().add(lblElve_1);
		
		JLabel lblElve_2 = new JLabel("El\u00E8ve");
		lblElve_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblElve_2.setBounds(36, 308, 84, 32);
		frame.getContentPane().add(lblElve_2);
		
		JTextArea élève1 = new JTextArea();
		élève1.setEditable(false);
		élève1.setBounds(130, 106, 84, 22);
		frame.getContentPane().add(élève1);
		
		JTextArea élève2 = new JTextArea();
		élève2.setEditable(false);
		élève2.setBounds(130, 170, 84, 22);
		frame.getContentPane().add(élève2);
		
		JTextArea élève3 = new JTextArea();
		élève3.setEditable(false);
		élève3.setBounds(130, 242, 84, 22);
		frame.getContentPane().add(élève3);
		
		JTextArea élève4 = new JTextArea();
		élève4.setEditable(false);
		élève4.setBounds(130, 316, 84, 22);
		frame.getContentPane().add(élève4);
		
		JLabel Heure = new JLabel("Heure");
		Heure.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure.setBounds(408, 98, 84, 32);
		frame.getContentPane().add(Heure);
		
		JLabel Heure_1 = new JLabel("Heure");
		Heure_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_1.setBounds(408, 162, 84, 32);
		frame.getContentPane().add(Heure_1);
		
		JLabel Heure_2 = new JLabel("Heure");
		Heure_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_2.setBounds(408, 234, 84, 32);
		frame.getContentPane().add(Heure_2);
		
		JLabel Heure_3 = new JLabel("Heure");
		Heure_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heure_3.setBounds(408, 308, 84, 32);
		frame.getContentPane().add(Heure_3);
		
		JTextArea Heure1 = new JTextArea();
		Heure1.setEditable(false);
		Heure1.setBounds(508, 106, 108, 22);
		frame.getContentPane().add(Heure1);
		
		JTextArea Heure1_1 = new JTextArea();
		Heure1_1.setEditable(false);
		Heure1_1.setBounds(508, 170, 108, 22);
		frame.getContentPane().add(Heure1_1);
		
		JTextArea Heure1_2 = new JTextArea();
		Heure1_2.setEditable(false);
		Heure1_2.setBounds(508, 244, 108, 22);
		frame.getContentPane().add(Heure1_2);
		
		JTextArea Heure1_3 = new JTextArea();
		Heure1_3.setEditable(false);
		Heure1_3.setBounds(508, 316, 108, 22);
		frame.getContentPane().add(Heure1_3);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRetour.setBounds(10, 417, 108, 43);
		frame.getContentPane().add(btnRetour);
		
		btnRetour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				professeur window = new professeur();
				window.frame.setVisible(true);
				frame.dispose();

			}
		});
		try {
			Connexion connect = new Connexion();
			Connection cnx = connect.dbConnection();
			Statement st;
			ResultSet rst;
			
			String retourLigne = System.getProperty("line.separator");
			
			
			st =cnx.createStatement();
			rst= st.executeQuery("Select * from rdv Where Nom = '"+nom_prof +"'");
			
			while(rst.next()) {
				élève1.setText(rst.getString("Eleve")+ retourLigne);
				Heure1.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				élève2.setText(rst.getString("Eleve")+ retourLigne);
				Heure1_1.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				élève3.setText(rst.getString("Eleve")+ retourLigne);
				Heure1_2.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
				élève4.setText(rst.getString("Eleve")+ retourLigne);
				Heure1_3.setText(rst.getString("Heure_debut")+ " - " + rst.getString("Heure_fin")+ retourLigne);
			}
		}catch(Exception ex) {
			
		}
		
	}

}
