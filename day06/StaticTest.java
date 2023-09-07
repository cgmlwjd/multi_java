package day06;

class Car{
	static String b = "나는 Car's 클래스변수";
	double a = 50.5;
}

public class StaticTest {
	int a = 10; //인스턴스 변수
	static int b = 20; //클래스 변수
	public static void main(String[] args) {
		//b 값을 출력하세요
		System.out.println("StaticTest.b = " + StaticTest.b);
		System.out.println("b: " + b);
		System.out.println("----------------------------");
		//car의 b값 출력하세요
		System.out.println("Car.b= " + Car.b);
		//Car의 a값 출력하세요
		Car c1 = new Car();
		System.out.println("Car.a= " + c1.a);
		
		StaticTest st = new StaticTest();
		System.out.println("st.a = " + st.a);
		
		System.out.println("st.b = " + st.b);
	}

}
