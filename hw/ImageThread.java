package hw;

import javax.swing.*;

public class ImageThread extends Thread{
	Quiz main;

	public ImageThread(Quiz main) {
		this.main = main;
	}
	
	public void run() {
		while(Quiz.timer != 0) {
			for(int i = 0; i < 10; i++) {
				ImageIcon icon = new ImageIcon("src/hw/images/T" + i + ".gif");
				main.image.setIcon(icon);
				
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
