package view;
import com.dbconnection.*;
import global_variable.*;

import java.awt.EventQueue;

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

public class page_connexion extends global{

	JFrame connexion;
	private JTextField Text_Nom;
	private JTextField Text_Mdp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_connexion window = new page_connexion();
					window.connexion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page_connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the connexion.
	 */
	private void initialize() {
		connexion = new JFrame();
		connexion.setBounds(100, 100, 390, 301);
		connexion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connexion.getContentPane().setLayout(null);

		Text_Nom = new JTextField();
		Text_Nom.setBounds(146, 27, 149, 20);
		connexion.getContentPane().add(Text_Nom);
		Text_Nom.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 23, 96, 21);
		connexion.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 95, 126, 21);
		connexion.getContentPane().add(lblNewLabel_1);

		Text_Mdp = new JTextField();
		Text_Mdp.setBounds(146, 96, 149, 20);
		connexion.getContentPane().add(Text_Mdp);
		Text_Mdp.setColumns(10);


		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setBounds(129, 185, 89, 23);
		connexion.getContentPane().add(btnNewButton);




		JButton btnConnexion = new JButton("Se connecter");
		btnConnexion.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connexion Connect = new Connexion();
				Connection cnx = Connect.dbConnection();
				System.out.println(Connect.dbConnection());
				String requete = "Select * from compte where Nom='" + Text_Nom.getText() + "'";
				ResultSet result = Connect.Requete(cnx, requete);
				try {
					while(result.next()) {
						System.out.println("Ca marche!");
						requete = "Select id from compte where Mdp='" + Text_Mdp.getText() + "'";
						ResultSet result_id = Connect.Requete(cnx, requete);
						while(result_id.next()) {
							id = result_id.getInt(1);
							result_id.close();
							connexion.dispose();
							index window = new index();
							((Window) window.index).setVisible(true);
							result.close();
						}
					}
					System.out.println("Ca marche pas...");
				}
				catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
	}
}
