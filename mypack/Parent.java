package mypack;

/* access modifier - 접근 제어자, 제한자, 지정자
//private < 생략형 < protected < public
 * private : 자기 클래스 내에서만 접근 가능
 * 생략형    : 같은 패키지 내에서만 접근 가능
 * protected: 같은 패키지 + 부모자식 상속관계면 접근 가능
 * public : 어디서든 접근 가능
 * 
 * */
public class Parent {
	public 	  int publicVar = 1;
	protected int protectedVar = 2;
	          int defaultVar = 3;
	private   int privateVar = 4;
	
	protected void show() {
		System.out.println("Parent's show() ****");
	}
}
