package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import global_variable.global;

import javax.swing.JButton;

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
		planning.setBounds(100, 100, 872, 546);
		planning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		planning.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Planning de "+nom_prof);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(336, 30, 199, 50);
		planning.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(274, 156, 176, 50);
		planning.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(274, 228, 176, 50);
		planning.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(274, 305, 176, 50);
		planning.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(274, 392, 176, 50);
		planning.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(617, 147, 176, 50);
		planning.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(617, 228, 176, 50);
		planning.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(617, 305, 176, 50);
		planning.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(617, 392, 176, 50);
		planning.getContentPane().add(textField_7);

		JLabel lblNewLabel_1 = new JLabel("Heure :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(532, 165, 75, 19);
		planning.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_4 = new JLabel("Date :\r\n");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(27, 104, 55, 25);
		planning.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_2 = new JLabel("Classe :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(149, 174, 84, 32);
		planning.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Classe :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(149, 239, 84, 32);
		planning.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Classe :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(149, 310, 84, 32);
		planning.getContentPane().add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Classe :");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(149, 394, 84, 32);
		planning.getContentPane().add(lblNewLabel_2_3);

		JLabel lblNewLabel_1_1 = new JLabel("Heure :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(532, 246, 75, 19);
		planning.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Heure :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(532, 317, 75, 19);
		planning.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Heure :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(532, 404, 75, 19);
		planning.getContentPane().add(lblNewLabel_1_3);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRetour.setBounds(10, 456, 156, 42);
		planning.getContentPane().add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				professeur window = new professeur();
				window.frame.setVisible(true);
				planning.dispose();

			}
		});

	}
}

