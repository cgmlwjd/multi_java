package day03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exam01 {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tfKor;
	private static JTextField tfMath;

	public static void main(String[] args) {
		JFrame f = new JFrame("::Exam01::");
		f.setSize(700, 900);
		f.setLocation(900, 100);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 192));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 22));
		lblNewLabel.setBounds(35, 64, 177, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 22));
		lblNewLabel_1.setBounds(35, 277, 177, 55);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 22));
		lblNewLabel_2.setBounds(35, 524, 177, 55);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 22));
		lblNewLabel_3.setBounds(35, 615, 177, 55);
		panel.add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setBounds(300, 66, 320, 55);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(300, 279, 320, 55);
		panel.add(tf2);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(300, 526, 320, 55);
		panel.add(tfKor);
		
		tfMath = new JTextField();
		tfMath.setColumns(10);
		tfMath.setBounds(300, 617, 320, 55);
		panel.add(tfMath);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tf1.getText();
				f.setTitle("input: " + input);
				String where="";
				if(input.equals("커피")) {
					where = "카페로 갈게요~";
				}
				else if(input.equals("아이스크림")) {
					where = "베스킨라빈스로 갈게요";
				}
				else {
					where = "물을 드세요~";
				}
				JOptionPane.showMessageDialog(f, where);
			}
		});
		btnNewButton.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 18));
		btnNewButton.setBounds(35, 156, 585, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age = tf2.getText();
				if(age == null || age.equals("")) {
					JOptionPane.showMessageDialog(f, "나이를 입력하세요");
					tf2.requestFocus();
					return;
				}
				else {
					int age1 = Integer.parseInt(age);
					int age2 = age1 + 1;
					JOptionPane.showMessageDialog(f, "당신의 내년 나이는 " + age2 + "살 입니다.");
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 18));
		btnNewButton_1.setBounds(35, 391, 585, 47);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kor = tfKor.getText();
				String math = tfMath.getText();
				
				if(kor == null || kor.equals("")) {
					showMsg("국어 점수를 입력하세요");
					tfKor.requestFocus();
					return;
				}
				
				if(math == null || math.equals("")) {
					showMsg("수학 점수를 입력하세요");
					tfMath.requestFocus();
					return;
				}
				
				int g1 = Integer.parseInt(kor);
				int g2 = Integer.parseInt(math);
				
				double avg = (g1 + g2) / 2;
				JOptionPane.showMessageDialog(f, "평균점수는 " + avg + "점 입니다.");
			}
		});
		btnNewButton_2.setFont(new Font("나눔바른고딕 Light", Font.BOLD, 18));
		btnNewButton_2.setBounds(35, 718, 585, 47);
		panel.add(btnNewButton_2);
		f.setVisible(true);
		
		
	}
	
	public static void showMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
