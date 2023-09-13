package day11;
/*스레드를 구현하는 방법
 * [1] java.lang.Thread클래스를 상속받아 구현
 * [2] java.lang.Runnable인터페이스를 상속받아 구현
 * 
 *    반드시 구현해야 하는 메서드
 *    public void run() : 스레드가 할일을 여기에 구현한다
 * 
 * */
public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("증가: " + i);
		}
	}

}

class MyThread2 extends Thread
{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("감소: " + (100-i));
		}
	}
}
