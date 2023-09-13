package day11;
import java.util.*;

class MyTimerTask extends TimerTask
{
	//특정 시간 이후에 실행할 일을 run()에서 구현한다
	@Override
	public void run() {
		System.out.println(">>게임이 종료되었습니다<<");
	}
	
}///////////////////////

public class TimerTest {

	public static void main(String[] args) {
		Timer timer=new Timer();
		MyTimerTask task=new MyTimerTask();
		System.out.println("현재 게임이 진행되고 있어요...5초 뒤에는 게임이 종료됩니다");
		//timer.schedule(task, 5000);
		//schedule(Task,mills)
		
		timer.scheduleAtFixedRate(task, 5000, 10000);
		//5초뒤에 task 작업을 수행하고, 10초 단위로 계속 실행

	}

}///////////////////////////////
