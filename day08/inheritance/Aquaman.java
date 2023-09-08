package day08.inheritance;
//Human으로 부터 상속받기
//double speed 추가하세요
//showInfo() 오버라이드 하세요
public class Aquaman extends Human {

	double speed;
	
	public Aquaman(String n, int h, double s) {
		this.name=n;
		height=h;
		speed=s;
	}
	@Override
	protected void showInfo() {
		super.showInfo();
		System.out.println("스피드: "+speed);
	}
	
	
}

