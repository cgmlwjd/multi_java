package day11;
//참조형: 1. 클래스형, 2. 인터페이스형, 3. 배열, 4. 열거형

public interface MyInter {
	void foo(); //추상메서드 public abstract가 자동으로 붙는다
	
}

interface YourInter{
	String GREETING = "Hi"; //public static final이 자동으로 붙는다.
	
	String bar();
}
