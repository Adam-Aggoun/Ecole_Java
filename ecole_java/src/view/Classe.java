package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JTextField;

import com.dbconnection.Connexion;

import javax.swing.JButton;
import java.awt.Color;

public class Classe {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classe window = new Classe();
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
	public Classe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 828, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Creation Classe");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(318, 11, 140, 42);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(294, 153, 192, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(294, 217, 192, 31);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(339, 319, 116, 42);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Connexion connect = new Connexion();
					Connection cnx = connect.dbConnection();
					try {
						String requete = "INSERT INTO classe (Nom, Effectif) VALUES ('"+textField.getText()+"', '"+textField_1.getText()+"')";
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
		
		JLabel lblNewLabel_1 = new JLabel("Nom Classe\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(151, 153, 95, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Effectif\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(151, 217, 95, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(642, 319, 116, 42);
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
