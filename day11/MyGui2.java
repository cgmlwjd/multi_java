package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui2 extends JFrame {
	Container cp;
	JPanel p1, p2;
	//JButton bt1, bt2;
	Choice ch;
	String[] color = {"red", "blue", "green", "magenta", "yellow", "cyan"};
	
	Canvas can;
	
	public MyGui2() {
		super("::MyGui2::");
		cp = this.getContentPane();
		p1 = new JPanel();
		p2 = new JPanel();
		cp.add(p1, "Center");
		cp.add(p2, "North");
		
		can = new Canvas();
		p1.add(can);
		can.setSize(200, 200);
		can.setBackground(Color.gray);
		
		ch = new Choice();
		p2.add(ch);
		
		for(String cr : color) {
			ch.add(cr);
		}
		MyHandler handler = new MyHandler(this);
		ch.addItemListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyGui2();
	}

}
