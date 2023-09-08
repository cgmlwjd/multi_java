package day08.inheritance;

//Overriding : 재정의
//부모로 부터 상속받은 메서드를 다시 정의해서 구성하는 것
/* [규칙]
* 	- 부모의 메서드와 이름을 동일하게
*  - 매개변수도 부모의 것과 동일하게
*  - 반환타입도 부모와 동일하게
*  - 메서드 몸체-내용은 다르게 구성하는 것
*  - 접근제한자는 부모와 동일하거나 부모의 접근 제한자보다
*  	범위가 더 넓은 범위 사용 가능
*  - Exception 은 부모와 동일하거나 더 구첵적인 예외를 발생시킬 수 있다
* 
* */

public class Superman extends Human {
	int power;
	public Superman(String n, int h, int p) {
		name = n;
		height = h;
		power = p;
		
	}
	
	@Override
	public void showInfo() {
//		System.out.println("이름 : "+ name);
//		System.out.println("키 : " + height);
		System.out.println("초능력: " + power);
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		this.showInfo();
	}
	
	public String showInfo(String title, int upPower) {
		String str = title + "\n";
		str += "이름: " + name + "\n키 : " + height + "\n초능력: " + power;
		str += ">>> 초능력 UP: " + upPower + "<<<\n";
		power+= upPower;
		str += "현재 초능력: " + power;
		return str;
	}
	
}
