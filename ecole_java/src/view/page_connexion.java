package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class page_connexion {

	 JFrame connexion;
	private JTextField textField;
	private JTextField textField_1;

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
		
		textField = new JTextField();
		textField.setBounds(146, 27, 149, 20);
		connexion.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Identifiant");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 23, 96, 21);
		connexion.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setBounds(129, 185, 89, 23);
		connexion.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 95, 126, 21);
		connexion.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 96, 149, 20);
		connexion.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
