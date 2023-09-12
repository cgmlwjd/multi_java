package day10;
/* 컴파일 타임 에러: FileNotFoundException, IOException
 * 런타임 에러 : ArithmeticException, ArrayIndexOutOfBoundsException, NullpointException..
 * 
 * throw로 예외를 선언할 때 Runtime 계열의 예외는 생략해도 된다.
 * */

class A{
	void sub() throws ArithmeticException {
		System.out.println(3 / 0);
	}
}

class B{
	void foo() throws ArithmeticException {
		A a = new A();
		//try {
		a.sub();
		//} catch(ArithmeticException e) {
			//System.out.println("연산 오류 : " + e.getMessage());
		//}
		
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		B b = new B();
		try {
			b.foo();
		} catch(Exception e) {
			System.out.println("연산 오류입니다. 분모가 0이면 안돼요");
		}
		
	}

}
