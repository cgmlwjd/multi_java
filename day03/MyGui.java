package day03;
import javax.swing.*;

public class MyGui {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setVisible(true);
		
		JButton bt = new JButton("회원가입");
		
		f.getContentPane().add(bt);
	}

}
