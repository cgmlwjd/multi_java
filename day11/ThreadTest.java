package day11;

public class ThreadTest {

	public static void main(String[] args) {
		//[1] java.lang.Thread클래스를 상속받아 구현했을 경우
		//스레드 사용방법
		//스레드 객체 생성한 뒤 start()를 호출한다
		MyThread tr1=new MyThread();
		MyThread2 tr2=new MyThread2();
		
		tr1.start();//증가 스레드
		tr2.start();//감소 스레드

		//[2] java.lang.Runnable인터페이스를 상속받아 구현했을 경우
		// <1> Runnable 상속받은 객체를 먼저 생성한다.==> run()코드를 가지고 있음
		// <2> Thread객체를 생성하되, Thread생성자의 인자로 <1>번의 Runnable객체를 전달한다
		// <3> Thread객체의 start()를 호출한다.	
		ClockThread r=new ClockThread();//Runnable객체
		Thread tr3=new Thread(r);
		tr3.start();
		
		
		
		System.out.println("Hello World~~ <==main스레드가 실행중");
	}

}