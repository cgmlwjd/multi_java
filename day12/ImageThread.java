package day12;

import javax.swing.*;

public class ImageThread extends Thread{
	
	MyAnimation main;
	boolean isStop = false;
	
	public ImageThread(MyAnimation main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0; !isStop; i++) {
			if(i > 9) {
				i = 0;
				
			}
			ImageIcon icon = new ImageIcon("src/day12/Images/T" + i + ".gif");
			main.lbImage.setIcon(icon);
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				System.out.println("예외: " + e);
			}
			
		}
	}
}
