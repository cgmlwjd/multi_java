package day11;
//[1] final + class : 상속받지 못함
final class Parent{
	int a=10;
}/////////////
//[2] final + method : 오버라이드 못함
class Child{ //extends Parent{ [x]
	void foo() {
		System.out.println("foo()");
	}
	final void bar() {
		System.out.println("bar()");
	}
	
}///////////////
class SubChild extends Child
{
	//final + 변수: 값 할당 못함
	//상수
	public static final double PI=3.14;
	
	@Override
	protected void foo() {
		super.foo();
		System.out.println("###");
	}
	/* final메서드는 오버라이드 불가
	void bar() {
		super.bar();
		System.out.println("@@@");
	}
	*/
	
}/////////////////////

public class FinalTest {

	public static void main(String[] args) {
		//SubChild의 PI값을 출력하기
		System.out.println(SubChild.PI);
		//SubChild.PI=30.14; [x]
		new SubChild().foo();

	}

}

