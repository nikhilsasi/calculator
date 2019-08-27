package com.resmng;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private static String action="";
	private static int num1=0,num2=0;
	private static float result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 298, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 8, 245, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 12));
		clear.setBounds(35, 50, 90, 40);
		frame.getContentPane().add(clear);
		
		//BUTTON 1
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button1.getText());
			}
		});
		button1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button1.setBounds(10, 220, 50, 50);
		frame.getContentPane().add(button1);
		
		//BUTTON 2
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button2.getText());
			}
		});
		button2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button2.setBounds(75, 220, 50, 50);
		frame.getContentPane().add(button2);
		
		//BUTTON 3
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button3.getText());
			}
		});
		button3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button3.setBounds(140, 220, 50, 50);
		frame.getContentPane().add(button3);
		
		//BUTTON 4
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button4.getText());
			}
		});
		button4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button4.setBounds(10, 160, 50, 50);
		frame.getContentPane().add(button4);
		
		// BUTTON 5
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button5.getText());
			}
		});
		button5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button5.setBounds(75, 160, 50, 50);
		frame.getContentPane().add(button5);
		
		//BUTTON 6
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button6.getText());
			}
		});
		button6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button6.setBounds(140, 160, 50, 50);
		frame.getContentPane().add(button6);
		
		// BUTTON 7
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button7.getText());
			}
		});
		button7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button7.setBounds(10, 100, 50, 50);
		frame.getContentPane().add(button7);
		
		//BUTTON 8
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button8.getText());
			}
		});
		button8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button8.setBounds(75, 100, 50, 50);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button9.getText());
			}
		});
		button9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button9.setBounds(140, 100, 50, 50);
		frame.getContentPane().add(button9);
		
		
		//zero
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button0.getText());
			}
		});
		button0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button0.setBounds(75, 280, 50, 50);
		frame.getContentPane().add(button0);
		
		//zero zero
		JButton button00 = new JButton("OO");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button00.getText());
			}
		});
		button00.setFont(new Font("Tahoma", Font.PLAIN, 5));
		button00.setBounds(10, 280, 50, 50);
		frame.getContentPane().add(button00);
		
		
		
		//ADD
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = button_add.getText();
				num1=Integer.valueOf(textField.getText());
				textField.setText("");
			}
		});
		button_add.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_add.setBounds(205, 220, 50, 50);
		frame.getContentPane().add(button_add);
		
		//SUBSTRACT
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action=button_sub.getText();
				num1=Integer.valueOf(textField.getText());
				textField.setText("");
			}
		});
		button_sub.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_sub.setBounds(205, 160, 50, 50);
		frame.getContentPane().add(button_sub);
		
		//DIVIDE
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action=button_divide.getText();
				num1=Integer.valueOf(textField.getText());
				textField.setText("");
			}
		});
		button_divide.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_divide.setBounds(205, 100, 50, 50);
		frame.getContentPane().add(button_divide);
		
		//MULTIPLY
		JButton btnmult = new JButton("X");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action=btnmult.getText();
				num1=Integer.valueOf(textField.getText());
				textField.setText("");
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnmult.setBounds(205, 43, 50, 50);
		frame.getContentPane().add(btnmult);
		
		
		//EQUAL
		JButton buttonequalto = new JButton("=");
		buttonequalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.valueOf(textField.getText());
				if(action=="+") {
					result=num1+num2;
					textField.setText(String.valueOf(result));
				}
				else if(action=="-") {
					result=num1-num2;
					textField.setText(String.valueOf(result));
				
					
				}
				else if(action=="/") {
					result=(float)num1/num2;
					textField.setText(String.valueOf(result));
				
				}
				else {
					result=num1*num2;
					textField.setText(String.valueOf(result));
				
				}
			}
		});
		buttonequalto.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonequalto.setBounds(205, 280, 50, 50);
		frame.getContentPane().add(buttonequalto);
		
		
		
	}
}
