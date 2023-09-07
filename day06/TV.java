package day06;
//has a : 속성 2개 ~ 3개
//메서드 3개
public class TV {
	String color = "black"; //인스턴스 변수(non-static변수) 객체명, 변수
	int size;
	int channel;
	boolean state;
	
	static String wifi = "KT";
	
	public void changeChannel(int ch) { //인스턴스 메서드(non-static 메서드) 객체명, 메서드명()
		channel = ch;
	}
	public void powerOn() {
		state = true;
	}
	
	public void powerOff() {
		state = false;
	}
	
	public String info() {
		String str = "--- TV정보 ---\n";
		str += "크기 " + size + "인치\n";
		str += "색상 " + color + "\n";
		return str;
	}
}
