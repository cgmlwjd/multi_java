package hw;

import javax.swing.*;

public class CountThread extends Thread{
	Quiz main;

	public CountThread(Quiz main) {
		this.main = main;
	}
	
	public void run() {
		while(Quiz.timer != 0) {
			main.count.setText("  park의 게임 시작: " + Quiz.timer);
			Quiz.timer -= 1;
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(Quiz.timer == 0) {
				JOptionPane.showMessageDialog(main, "카운트가 종료되었습니다.");
			}
		}
	}

}
