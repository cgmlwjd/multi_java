package day08;
/*this  : static메서드에서는 사용 불가
 * this.변수
 * this.메서드()
 * this() : 자기자신의 생성자를 호출
 * 	==> 생성자 안에서만 호출 가능
 * 		생성자 첫번째 줄에 위치해야 함
 * 
 * */

public class Superman {
	String name; //이름
	int height; //키
	int power; //초능력
	
	//생성자를 하나라도 구성하면 컴파일러가 제공하면 디폴트 생성자는 제공되지 않는다.
	public Superman() {
		this("슈퍼맨", 150, 50); //자기 자신의 생성자를 호출
//		name = "슈퍼맨";
//		height = 150;
//		power = 50;
	}
	
	//인자생성자
	public Superman(String name, int height, int power) {
		this.name = name;
		this.height = height;
		this.power = power;
	}
	
	//생성자 2개 오버로딩 하기
	public Superman(String n) {
		this(n, 160, 150);
//		name = n;
//		height = 160;
//		power = 150;
	}
	
	public Superman(String name, int height) {
		this(name, height, 200);
//		this.name = name;
//		this.height = height;
//		this.power = 200;
	}
	
	public String showInfo() {
//		this("아무개", 177, 100);
		String str = "----슈퍼맨 정보----\n";
		str += "이름: " + name + "\n키: " + height + "\n초능력: " + power;
		return str;
	}

}
