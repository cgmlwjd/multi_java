package day03;

import javax.swing.*;
import javax.swing.text.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;


public class MyCalc {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tf_result;
	public static void main(String[] args) {
		
		
		JFrame f = new JFrame("::My Calc v1.0::");
		f.setSize(500, 1000);
		f.setLocation(800, 100);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\multicampus\\JavaWorkspace\\Begin\\img\\calc.png"));
		lblNewLabel.setBounds(160, 26, 239, 351);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(47, 388, 152, 60);
		panel.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.BOLD, 36));
		tf1.setBounds(128, 373, 303, 75);
		panel.add(tf1);
		tf1.setColumns(10);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(47, 500, 152, 60);
		panel.add(lblNewLabel_1_1);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("굴림", Font.BOLD, 36));
		tf2.setColumns(10);
		tf2.setBounds(128, 496, 303, 75);
		panel.add(tf2);
		
		JButton bt1 = new JButton("+");
		bt1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String str1 = tf1.getText();
				String str2 = tf2.getText();
				float i = Float.valueOf(str1);
				float j = Float.valueOf(str2);
				double k = 0;
				
				k = i + j;
				String result = String.valueOf(k);
				tf_result.setText(result);
			}
		});
		bt1.setFont(new Font("굴림", Font.PLAIN, 36));
		bt1.setBounds(12, 610, 91, 85);
		panel.add(bt1);
		
		JButton bt2 = new JButton("-");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = tf1.getText();
				String str2 = tf2.getText();
				float i = Float.valueOf(str1);
				float j = Float.valueOf(str2);
				double k = 0;
				
//				if(i > j) {
//					k = i - j;
//				}
//				else {
//					k = j - i;
//				}
				
				k = i - j;
				
				String result = String.valueOf(k);
				tf_result.setText(result);
			}
		});
		bt2.setFont(new Font("굴림", Font.PLAIN, 36));
		bt2.setBounds(128, 610, 91, 85);
		panel.add(bt2);
		
		JButton bt3 = new JButton("x");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = tf1.getText();
				String str2 = tf2.getText();
				float i = Float.valueOf(str1);
				float j = Float.valueOf(str2);
				double k = 0;
				
				k = i * j;
				String result = String.valueOf(k);
				tf_result.setText(result);
			}
		});
		bt3.setFont(new Font("굴림", Font.PLAIN, 36));
		bt3.setBounds(253, 610, 91, 85);
		panel.add(bt3);
		
		JButton bt4 = new JButton("/");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = tf1.getText();
				String str2 = tf2.getText();
				float i = Float.valueOf(str1);
				float j = Float.valueOf(str2);
				double k = 0;
				
				k = i / j;
				String result = String.valueOf(k);
				tf_result.setText(result);
			}
		});
		bt4.setFont(new Font("굴림", Font.PLAIN, 36));
		bt4.setBounds(383, 610, 91, 85);
		panel.add(bt4);
		
		tf_result = new JTextField();
		tf_result.setFont(new Font("굴림", Font.BOLD, 36));
		tf_result.setColumns(10);
		tf_result.setBounds(47, 715, 384, 85);
		panel.add(tf_result);
		f.setVisible(true);
		
	}
}