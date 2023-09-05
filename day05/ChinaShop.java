package day05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChinaShop {
	
	static String[] menu= {"짜장면","짬뽕","우동"};
	static int [] price= {7000,8000,5000};
	static ImageIcon[] images= {
		new ImageIcon("src/day05/0.png"),
		new ImageIcon("src/day05/1.png"),
		new ImageIcon("src/day05/2.png")
	};

	static int total=0;
	static int count=0;
	
	public static void main(String[] args) {
		JFrame f=new JFrame(":::홍콩 반점:::");
		f.setSize(700,900);
		f.setLocation(1200,200);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton bt1 = new JButton("짜장면");
		
		bt1.setBackground(new Color(0, 128, 128));
		bt1.setFont(new Font("굴림", Font.BOLD, 30));
		bt1.setBounds(35, 29, 132, 81);
		panel.add(bt1);
		
		JButton bt2 = new JButton("짬  뽕");
		
		bt2.setFont(new Font("굴림", Font.BOLD, 30));
		bt2.setBackground(new Color(255, 245, 238));
		
		bt2.setOpaque(true);
		bt2.setBorderPainted(false);
		
		bt2.setBounds(191, 29, 132, 81);
		panel.add(bt2);
		
		JButton bt3 = new JButton("우  동");
		
		bt3.setFont(new Font("굴림", Font.BOLD, 30));
		bt3.setBackground(new Color(233, 150, 122));
		bt3.setBounds(335, 29, 132, 81);
		panel.add(bt3);
		
		JLabel lbCnt = new JLabel("개수: 0개");
		lbCnt.setFont(new Font("굴림", Font.BOLD, 30));
		lbCnt.setBounds(479, 29, 162, 81);
		panel.add(lbCnt);
		
		JLabel lbImg = new JLabel("New label");
		lbImg.setIcon(new ImageIcon(ChinaShop.class.getResource("/day05/china.png")));
		lbImg.setBounds(35, 161, 606, 360);
		panel.add(lbImg);
		
		JLabel lbTotal = new JLabel("총 결제금액:");
		lbTotal.setFont(new Font("굴림", Font.BOLD, 26));
		lbTotal.setBounds(62, 555, 564, 254);
		panel.add(lbTotal);
		
		//이벤트처리--------------
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbImg.setIcon(images[0]);
				count++;
				lbCnt.setText(count+"개");
				total+=price[0];
				
				lbTotal.setText("총 결제금액: "+total+"원");
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbImg.setIcon(images[1]);
				count++;
				lbCnt.setText(count+"개");
				
				total+=price[1];
				lbTotal.setText("총 결제금액: "+total+"원");
				
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbImg.setIcon(images[2]);
				count++;
				lbCnt.setText(count+"개");
				total+=price[2];
				lbTotal.setText("총 결제금액: "+total+"원");
				
			}
		});
		f.setVisible(true);
	}
}
