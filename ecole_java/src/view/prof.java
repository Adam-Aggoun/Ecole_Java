package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class prof {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prof window = new prof();
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
	public prof() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 736, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Professeur ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(303, 25, 205, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Planning\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						frame.dispose();
						planning window = new planning();
						window.planning.setVisible(true);
						
					}
				});
			
		
		btnNewButton.setBounds(300, 125, 136, 38);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vue des classes", "STI2D", "SISR", "CPRP", "SLAM"}));
		comboBox.setBounds(300, 210, 136, 38);
		frame.getContentPane().add(comboBox);
		
		JButton btnDconnexion = new JButton("d\u00E9connexion");
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDconnexion.setBounds(37, 394, 136, 38);
		frame.getContentPane().add(btnDconnexion);
		
		JButton btnNewButton_1 = new JButton("G\u00E9rer classe");
		btnNewButton_1.setBounds(303, 277, 133, 38);
		frame.getContentPane().add(btnNewButton_1);
		btnDconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				gestion window = new gestion();
				window.frame.setVisible(true);
						
					}
				});
	}
}
