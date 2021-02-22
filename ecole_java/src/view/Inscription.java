package view;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	
	
	
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
		Inscription.setBounds(100, 100, 480, 579);
		Inscription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Inscription.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Inscription");
		btnNewButton.setBounds(93, 482, 168, 23);
		Inscription.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setBounds(10, 34, 49, 14);
		Inscription.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(229, 31, 128, 20);
		Inscription.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setBounds(10, 94, 49, 14);
		Inscription.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Identifiant");
		lblNewLabel_2.setBounds(10, 153, 75, 14);
		Inscription.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mot de passe");
		lblNewLabel_3.setBounds(10, 224, 139, 14);
		Inscription.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirmer mot de passe");
		lblNewLabel_4.setBounds(10, 295, 173, 14);
		Inscription.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Classe");
		lblNewLabel_5.setBounds(10, 371, 49, 14);
		Inscription.getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(229, 91, 128, 20);
		Inscription.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(229, 150, 128, 20);
		Inscription.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(229, 221, 128, 20);
		Inscription.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(229, 292, 128, 20);
		Inscription.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Classe", "STI2D", "CPRP", "SLAM", "SISR"}));
		comboBox.setBounds(229, 367, 128, 22);
		Inscription.getContentPane().add(comboBox);
		{
            String valeurChamp1 = lblNewLabel_2.getText();
            lblNewLabel_2.setText(valeurChamp1);
            String valeurChamp2 = lblNewLabel_1.getText();
            lblNewLabel_1.setText(valeurChamp2);
            String valeurChamp3 = lblNewLabel_5.getText();
            lblNewLabel_5.setText(valeurChamp3);
            String valeurChamp4 = lblNewLabel_3.getText();
            lblNewLabel_3.setText(valeurChamp4);
            String valeurChamp5 = lblNewLabel.getText();
            lblNewLabel.setText(valeurChamp5);
       
		try {
			
			
			Statement stm = cnx.createStatement();
			ResultSet resultat = statement.executeQuery( "SELECT id, Nom, Prenom, Classe, Mdp, Role, Mail  FROM compte;" );
			int statut = statement.executeUpdate( "INSERT INTO compte (Nom, Prenom, Classe, Mdp, Mail) VALUES ('"+valeurChamp5+"', '"+valeurChamp2+"', '"+valeurChamp3+"', '"+valeurChamp4+"', '"+valeurChamp1+")'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
	}
}}
