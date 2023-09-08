package day06;
//has a : 속성 2개 ~3개
//메서드 : 3개
public class TV {
	
	String color="black";//인스턴스 변수(non-static변수)	객체명.변수
	int size;//0
	int channel;//0
	boolean state;
	
	static String wifi="KT";//클래스 변수(static변수)  클래스명.변수
	//static==> 망치 ==> 객체들마다 공유한다
	
	public void changeChannel(int ch) { //인스턴스 메서드(non-static메서드)  객체명.메서드명()
		channel=ch;
	}
	public void powerOn() {
		state=true;
	}
	public void powerOff() {
		state=false;
	}
	
	public String info() {
		
		String str="---TV정보----\n";
		str+="크기: "+size+"인치\n";
		str+="색상: "+color+"\n";
		str+="WIFI: "+wifi+"\n";
		return str;
	}
}