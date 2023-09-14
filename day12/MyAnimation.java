package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyAnimation extends JFrame implements ActionListener {
	JPanel pN, pC;
	Container cp;
	JLabel lbImage;
	JButton btStart, btStop;
	ImageIcon icon;
	ImageThread tr = new ImageThread(this);
	
	public MyAnimation() {
		super ("MyAnimation");
		pN= new JPanel();
		pC = new JPanel();
		cp = this.getContentPane();
		cp.add(pN, "North");
		cp.add(pC, "Center");
		pN.setBackground(Color.pink);
		pC.setBackground(Color.lightGray);
		
		pN.add(btStart = new JButton("Start"));
		pN.add(btStop = new JButton("Stop"));
		
		icon = new ImageIcon("src/day12/images/T0.gif");
		lbImage = new JLabel(icon);
		pC.setLayout(null);
		pC.add(lbImage);
		lbImage.setBounds(200, 80, 200, 200);
		
		tr = new ImageThread(this);
		
		//리스너 부착
		btStart.addActionListener(this);
		btStop.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btStart) {
			//setTitle("start");
			if(tr != null) {
				tr = new ImageThread(this);
				tr.isStop = false;
				tr.start();
			}
		} else if(obj == btStop) {
			//setTitle("stop");
			if(tr != null) {
				tr.isStop = true;
				tr = null;
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyAnimation my = new MyAnimation();
		my.setSize(600, 600);
		my.setVisible(true);
	}

}
