package bs;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;

public class MainPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField name_field;
	private JTextField org_field;
	private JTextField username_field;
	private JTextField dob_field;
	private JTextField mobile_field;
	private JPanel panel;
	private JPasswordField password_Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection connection=null;
	
	
	
	
	private void initialize() {
		
		/*
		try {
		Class.forName("org.h2.Driver");
		connection=DriverManager.getConnection("jdbc:h2:~/test","sa","");
		
		JOptionPane.showMessageDialog(null,"connection Sucessfull");
		
		} 
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		*/
		
		
		
		frame = new JFrame();
		frame.setBounds(200, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(315, 13, 424, 87);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(603, 121, 319, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(603, 185, 319, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserName.setBounds(428, 113, 130, 32);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(424, 179, 154, 39);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Tasks().setVisible(true);
				//System.out.println("ho");
			}
		});
		btnLogIn.setBounds(698, 249, 167, 32);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnSignUp = new JButton("Create Account");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
			}
		});
		btnSignUp.setBounds(42, 140, 184, 48);
		frame.getContentPane().add(btnSignUp);
		
		 panel = new JPanel();
		 panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		 panel.setVisible(false);
		//Make variable global
		panel.setBounds(22, 239, 521, 301);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 28, 67, 16);
		panel.add(lblName);
		
		name_field = new JTextField();
		
		name_field.setBounds(126, 25, 134, 21);
		panel.add(name_field);
		name_field.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(12, 65, 67, 16);
		panel.add(lblUsername);
		
		org_field = new JTextField();
		org_field.setBounds(126, 155, 139, 19);
		panel.add(org_field);
		org_field.setColumns(10);
		
		JLabel lblChoosePassword = new JLabel("choose Password");
		lblChoosePassword.setBounds(12, 110, 105, 16);
		panel.add(lblChoosePassword);
		
		username_field = new JTextField();
		username_field.setColumns(10);
		username_field.setBounds(126, 63, 139, 19);
		panel.add(username_field);
		
		JLabel lblNewLabel_1 = new JLabel("Oranization");
		lblNewLabel_1.setBounds(12, 157, 94, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setBounds(12, 202, 67, 16);
		panel.add(lblDob);
		
		dob_field = new JTextField();
		dob_field.setColumns(10);
		dob_field.setBounds(126, 200, 139, 19);
		panel.add(dob_field);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setBounds(12, 250, 75, 16);
		panel.add(lblMobileNo);
		
		mobile_field = new JTextField();
		mobile_field.setBounds(124, 244, 147, 22);
		panel.add(mobile_field);
		mobile_field.setColumns(10);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(332, 24, 134, 25);
		panel.add(btnCreateAccount);
		
		password_Field = new JPasswordField();
		password_Field.setBounds(126, 107, 132, 22);
		panel.add(password_Field);
	}
}
