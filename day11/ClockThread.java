package day11;
import java.util.*;
//[2] Runnable인터페이스를 상속받아 구현해보자
public class ClockThread implements Runnable{
	/**스레드를 중지할때 사용변수 */
	boolean isStop=false;
	
	@Override
	public void run() {
		while(!isStop) {
			Date date=new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);//1초 동안 block된다
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}//while----------		
	}

}
