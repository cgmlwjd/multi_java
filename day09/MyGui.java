package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui extends JFrame {
	
	JButton b1, b2, b3, b4;
	JPanel p;
	Container cp;
	MyDialog dial;
	
	public MyGui() {
		super("::MyGui 프로그램::");
		cp = this.getContentPane();
		
		p= new JPanel();
		p.setLayout(null);
		cp.add(p, "Center");
		p.setBackground(Color.yellow);
		
		b1 = new JButton("학생");
		b2 = new JButton("교사");
		b3 = new JButton("직원");
		b4 = new JButton("종료");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		b1.setBounds(20, 30, 120, 50);
		b2.setBounds(160, 30, 120, 50);
		b3.setBounds(300, 30, 120, 50);
		b4.setBounds(20, 400, 120, 50);
		
		JFrame f = new JFrame();
		
		dial = new MyDialog(this, true);
		
		b1.addActionListener(e -> {
			//MyDialog 생성해서 setSize, setVisible
			//MyDialog dial = new MyDialog(this, true); //this를 넘겨야 한다.
			dial.setSize(300, 300);
			dial.setVisible(true);
		});

		b4.addActionListener(e -> {
			System.exit(0); //0: 정상종료 시, 0이 아닌 값 : 에러 발생시 종료
		});
	}

	public static void main(String[] args) {
		//System.out.println("My Gui");
		MyGui my = new MyGui();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
