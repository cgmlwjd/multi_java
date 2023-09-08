package day06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyDiarySubFrame {
	private JTextField tfDate;
	private JTextField tfTitle;
	JFrame f=new JFrame();
	
	public void createSubGui() {
		
		f.setSize(800,800);
		f.setLocation(800,200);//x,y
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tfDate = new JTextField();
		tfDate.setFont(new Font("굴림", Font.BOLD, 24));
		tfDate.setBounds(37, 39, 699, 78);
		panel.add(tfDate);
		tfDate.setColumns(10);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("굴림", Font.BOLD, 24));
		tfTitle.setColumns(10);
		tfTitle.setBounds(37, 153, 699, 78);
		panel.add(tfTitle);
		
		JTextArea taContent = new JTextArea();
		taContent.setBounds(37, 268, 699, 374);
		panel.add(taContent);
		
		JButton btSave = new JButton("파일에 저장");
		btSave.setBackground(new Color(255, 160, 122));
		btSave.setFont(new Font("굴림", Font.BOLD, 20));
		btSave.setBounds(37, 675, 335, 78);
		panel.add(btSave);
		
		JButton btRead = new JButton("일기 가져오기");
		btRead.setFont(new Font("굴림", Font.BOLD, 20));
		btRead.setBackground(new Color(255, 160, 122));
		btRead.setBounds(401, 675, 335, 78);
		panel.add(btRead);
		
		tfDate.setBorder(new TitledBorder("오늘 날짜"));
		tfTitle.setBorder(new TitledBorder("제  목"));
		taContent.setBorder(new TitledBorder("일기 내용"));
		
		f.setVisible(true);
	}
	
//	public static void main(String[] args) {
//		MyDiarySubFrame sub=new MyDiarySubFrame();
//		sub.createSubGui();
//	}
}
