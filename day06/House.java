package day06;
//Abstarction(추상화) : 프로그램과 관련된 객체들을 class로 구성하는 것
//객체 = 속성(variable) + 행동양식(method)
public class House {
	//1. 속성 -> 멤버변수
	int room;
	String owner;
	String addr;
	
	//2. 기능 -> 매서드(method) => 동사형, 소문자로 시작, camel표기법 사용
	public void printInfo() {
		System.out.println("---- House 정보 ----");
		System.out.println("소유주 : " + owner);
		System.out.println("방   수 : " + room);
		System.out.println("주   소 : " + addr);
	}
	
	public String  rent( String type, int price) {
		String str = "---" + owner + "의 집 --- \n";
		str += "거래 유형 : " + type + "\n";
		str += "가        격 : " + price + "만원\n";
		return str;
	}
	
}
