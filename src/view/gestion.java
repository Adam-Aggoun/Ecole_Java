package view;
import com.dbconnection.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

import global_variable.global;

import javax.swing.JButton;
import javax.swing.JTextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class gestion {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField sanction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestion window = new gestion();
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
	public gestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 715, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("gestion des classes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(256, 32, 195, 53);
		frame.getContentPane().add(lblNewLabel);



		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(531, 112, 136, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Motif :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(49, 347, 128, 53);
		frame.getContentPane().add(lblNewLabel_1);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBounds(49, 398, 473, 173);
		frame.getContentPane().add(textPane);

		JLabel lblNewLabel_2 = new JLabel("Nom \u00E9l\u00E8ve");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(404, 112, 117, 37);
		frame.getContentPane().add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(531, 179, 136, 45);
		frame.getContentPane().add(textField_1);

		JLabel lblNewLabel_2_1 = new JLabel("Pr\u00E9nom \u00E9l\u00E8ve");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(385, 179, 136, 37);
		frame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("Date :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(34, 198, 68, 45);
		frame.getContentPane().add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(112, 198, 136, 45);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("Sanction");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(34, 302, 117, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		sanction = new JTextField();
		sanction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sanction.setBounds(112, 301, 257, 35);
		frame.getContentPane().add(sanction);
		sanction.setColumns(10);
		
		JLabel lblError = new JLabel("");
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblError.setForeground(Color.GREEN);
		lblError.setBounds(173, 347, 349, 40);
		frame.getContentPane().add(lblError);
		

		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnValider.setBounds(546, 416, 145, 37);
		frame.getContentPane().add(btnValider);
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Connexion connect = new Connexion();
				Connection cnx = connect.dbConnection();
				try {
					String requete = "INSERT INTO gestion_classe (Nom, Prenom, Date, Sanction, Motif) VALUES ('"+textField.getText()+"', '"+textField_1.getText()+"','"+textField_2.getText()+"','"+sanction.getText()+"', '"+textPane.getText()+"')";
					connect.Requete_prepare(cnx, requete);
					lblError.setText("Sanction enregistrée");
				} 
				catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
			}
		});
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRetour.setBounds(546, 484, 145, 37);
		frame.getContentPane().add(btnRetour);
		
		btnRetour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				professeur window = new professeur();
				window.frame.setVisible(true);
				frame.dispose();

			}
		});

		Connexion connect = new Connexion();
		Connection cnx = connect.dbConnection();
		String requete = "Select Nom from eleve";
		ResultSet result = connect.Requete(cnx, requete);
		

		
		JComboBox comboBox = new JComboBox();
		try {
			while(result.next()) {
				comboBox.addItem(result.getString(1).trim());
			}
			result.close();
			
		} catch (Exception ex) {
		
		}
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nom_eleve = comboBox.getSelectedItem().toString();
			String requete = "Select * from eleve Where Nom = '"+nom_eleve+"'";
			ResultSet result = connect.Requete(cnx, requete);
				try {
					while(result.next()) {
						textField.setText(result.getString("nom"));
						textField_1.setText(result.getString("prenom"));
					}
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(34, 112, 136, 45);
		frame.getContentPane().add(comboBox);
		
		
		
		
	}
}
