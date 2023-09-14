package hw;

import java.awt.*;
import javax.swing.*;

public class Quiz extends JFrame {
	JLabel count, image, lbday;
	Container cont;
	CountThread ct;
	ImageThread it;
	ClockThread clt;
	static Quiz main;
	static int timer = 50;
	
	public Quiz() {
		cont = this.getContentPane();
		cont.setBackground(Color.WHITE);
		setSize(800, 300);
		count = new JLabel("카운트");
		count.setFont(new Font("굴림", Font.BOLD, 40));
		count.setForeground(new Color(0, 0, 255));
		image = new JLabel("");
		lbday = new JLabel("시각");
		lbday.setFont(new Font("굴림", Font.BOLD, 35));
		lbday.setForeground(new Color(0, 255, 0));
		
		cont.add(count, "West");
		cont.add(image, "East");
		cont.add(lbday, "South");
		
		ct = new CountThread(this);
		ct.start();
		it = new ImageThread(this);
		it.start();
		clt = new ClockThread(this);
		clt.start();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		main = new Quiz();
	}

}
