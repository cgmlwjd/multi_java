package day06;
//메서드(method), function: 기능
/* [1] 인스턴스 메서드: non-static 메서드  "객체명.메서드()"
 * [2] 클래스 메서드 : static 메서드  "클래스명.메서드"
 * */

public class MyDemo {
	//매개변수x, 반환값x
	public void showStar() { //instance method
		System.out.println("★★★★");
	}
	
	static public void showSnail() {//class method
		System.out.println("@@@@");
	}
	//매개변수를 받는 메서드, 반환값 x
	public static void showShape(char ch, int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}//----------------------------
	
	public void greeting(String term, String name) {
		System.out.println(term+" "+name+"님~~");
	}
	//String ... names: 호출하는 쪽에서 넣는 만큼 names로 받는다
	//names==> String타입의 배열
	public void greetingMany(String term, String ... names) {
		System.out.print(term+" ");		
		//System.out.print(names);
		for(String name:names) {
			System.out.print(name+"님, ");
		}
		System.out.println();
	}

}
