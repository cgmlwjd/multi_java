package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//JDialog 클래스를 상속받아 MyDialog를 구성합니다.
public class MyDialog extends JDialog {
	JLabel lb;
	Container cp;
	JButton btClose;
	ImageIcon icon, icon2;
	
	
	public MyDialog(JFrame parent, boolean modal) {
		super(parent, modal);
//		parent.setSize(100, 100);
//		parent.setVisible(true);
		
		((MyGui)parent).b1.setText("Student");
		((MyGui)parent).b1.setBackground(Color.magenta);
		//cp를 얻어와서
		cp = this.getContentPane();
		icon = new ImageIcon("src/day09/icon1.png");
		icon2 = new ImageIcon("src/day09/icon2.png");
		//lb를 붙인다.
		//단 lb가 먼저 생성되어야 한다.
		lb = new JLabel("반갑습니다.");
		lb.setIcon(icon);
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setHorizontalAlignment(JLabel.CENTER);
		
		btClose = new JButton("Close");
		cp.add(lb);
		cp.add(btClose, "South");
		
		btClose.addActionListener(e -> {
			//MyDialog만 닫기도록 처리
			//System.exit(0); ==> 프로그램이 종료됨
			//MyDialog my = new MyDialog();
			this.setVisible(false);
			this.dispose();
		});
	}

}
