package hw;

import java.util.*;

public class ClockThread extends Thread {
	
	Quiz main;
	
	public ClockThread(Quiz main) {
		this.main = main;
	}

	@Override
	public void run() {
		for(int i = Quiz.timer; i > 0; i--) {
			Date date = new Date();
			main.lbday.setText("  " + date + " ");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
