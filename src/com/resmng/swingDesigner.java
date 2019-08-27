package com.resmng;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;


public class swingDesigner {

	private JFrame frame;
	private JTextField txtRestaurantManagementSystem;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingDesigner window = new swingDesigner();
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
	public swingDesigner() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 778, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtRestaurantManagementSystem = new JTextField();
		txtRestaurantManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtRestaurantManagementSystem.setText("RESTAURANT MANAGEMENT SYSTEM");
		txtRestaurantManagementSystem.setBounds(207, 11, 362, 32);
		frame.getContentPane().add(txtRestaurantManagementSystem);
		txtRestaurantManagementSystem.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setBounds(255, 54, 234, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		DateFormat dateFormat= new SimpleDateFormat("E, dd MMMM yyyy HH:mm:ss");
		Calendar cal =Calendar.getInstance();
		textField.setText(dateFormat.format(cal.getTime()));
	}
}
