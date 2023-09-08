package day08;

public class Aquaman {
	String name;
	int height;
	double speed;
	
	//생성자 오버로딩 2개
	//this를 이용하여 초기화
	public Aquaman() {
		this("아쿠아맨", 160, 0.0);
//		name = "아쿠아맨";
//		height= 160;
//		speed = 0.0;
	}
	
	public Aquaman(String n, int h, double s) {
		this(h, s, n);
//		name = n;
//		height = h;
//		speed = s;
	}
	
	public Aquaman(String n) {
		name = n;
		height= 170;
		speed = 100;
	}
	
	public Aquaman(String n, int h) {
		name = n;
		height = h;
		speed = 180;
	}
	
	public Aquaman(int h, double s, String n) {
		name = n;
		height = h;
		speed = s;
	}
	
	

	public String showInfo() {
		String str = "----아쿠아맨 정보----\n";
		str += "이름: " + name + "\n키: " + height + "\n스피드: " + speed;
		return str;
	}
}
