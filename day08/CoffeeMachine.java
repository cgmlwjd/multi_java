package day08;
/* 다형성(Polymorphism)
 * 오버로딩(Overloading)
 * 	<1> 메서드 오버로딩
 * 	<2> 생성자 오버로딩
 * - 동일한 메서드 이름으로 여러 개 구성하는 것
 * 단, 매개변수의 자료형, 개수, 순서가 다르게 구성해야 된다.
 * 
 * [규칙]
 * <1> 메서드 이름은 동일하게
 * <2> 매개변수의 자료형, 개수, 순서가 다르게 구성해야 된다.
 * <3> 반환타입은 신경쓰지 않는다. (같아도 되고 달라도 된다.)
 * - 오버라이딩(Overriding_)
 * 	 상속 개념과 맞물려 사용한다.
 * */


public class CoffeeMachine {
	int coffee;
	int sugar;
	int cream;
	
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		int sum = this.coffee + this.sugar + this.cream;
		System.out.println("밀크 커피 나가요~ 농도 : " + sum);
	}
	
	public void makeTea(int c, int s) {
		coffee = c;
		sugar = s;
		System.out.println("설탕 커피 나가요~ 농도 : " + (coffee+sugar));
	}
	
	public String makeTea(int c) {
		coffee = c;
		return "블랙 커피 나가요~ 농도 : " + coffee;
	}
	
	//크림 커피 만들기
	public void makeTea(int coffee, long cream) {
		this.coffee = coffee;
		this.cream = (int)cream;
		System.out.println("크림 커피 나가요~ 농도 : " + (this.coffee + this.cream));
	}
	
	public void makeTea(long cr, int cf) { //순서를 다르게 구성
		this.makeTea(cf, cr); //자기 자신의 메소드를 호출할 때 this.메서드()
		
	}
	
	//유자차 메서드 오버로딩
	public String makeTea(Yuja y) {
		String str = "유자 농도: " + y.getYuja() + "\n설탕 농도: "+y.getSugar();
			   str += "\n유자차 나가요~ 농도: " + (y.getYuja() + y.getSugar());
		
		return str;
	}
	
	
}
