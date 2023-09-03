package day03;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {
	public static void main(String[] args) {
		JFrame f = new JFrame("::MyWindow::");
		f.setSize(800, 800);
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int yn = JOptionPane.showConfirmDialog(f, "프로그램을 종료할까요");
				f.setTitle("yn = " + yn);
				if(yn == 0) {
					System.exit(0);
				}
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("New button");
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "이름을 입력해야 합니다.");
			}
		});
		
		JButton btnNewButton_3 = new JButton("New button");
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Welcome to Application");
			}
		});
		f.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		f.setVisible(true);
	}
}
