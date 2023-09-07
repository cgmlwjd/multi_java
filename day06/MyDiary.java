package day06;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class MyDiary {
	String memberInfo[] = {"root", "tiger123"};
	private JTextField tfId;
	private JTextField tfPw;
	
	public void createGUI() {
		JFrame f = new JFrame("::나의 일기장::");
		f.setBounds(1200, 200, 700, 900);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/Diary.png")));
		lblNewLabel.setBounds(231, 70, 222, 194);
		panel.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setBounds(67, 311, 555, 83);
		panel.add(tfId);
		tfId.setColumns(10);
		tfId.setBorder(new TitledBorder("ID"));
		
		tfPw = new JTextField();
		tfPw.setColumns(10);
		tfPw.setBounds(67, 468, 555, 83);
		panel.add(tfPw);
		tfPw.setBorder(new TitledBorder("Password"));
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("bt1");
				//아이디, 비밀번호값 얻어와서, memberInfo배열에 저장된 값과 비교
				//일치하면 "환영합니다 root님~~" 메시지 다이얼로그 띄우기
				//일치하지 않으면 "아이디가 틀리거나 비밀번호가 틀려요"  메시지 다이얼로그 띄우기
				
				String str1 = tfId.getText();
				String str2 = tfPw.getText();
				String str3[] = {str1, str2};
				MyDiary my = new MyDiary();
				String str4[] = my.memberInfo;
				if(Arrays.equals(str3, str4)) {
					JOptionPane.showMessageDialog(f, "환영합니다 root님");
				} else {
					JOptionPane.showMessageDialog(f, "아이디가 틀리거나 비밀번호가 틀립니다.");
				}
			}
		});
		bt1.setMnemonic('L');
		bt1.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/L.png")));
		bt1.setBounds(99, 666, 162, 152);
		panel.add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tfId, tfPw 값 비워주기
				//tfId에 입력 포커스 주기
				f.setTitle("bt2");
				tfId.setText(null);
				tfPw.setText(null);
				tfId.setFocusable(true);
				tfId.requestFocus();
			}
		});
		bt2.setMnemonic('R');
		bt2.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/reset.png")));
		bt2.setBounds(460, 666, 162, 152);
		panel.add(bt2);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyDiary my = new MyDiary();
		my.createGUI();
		
	}
}
