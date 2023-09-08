package day07;

public class Student {
	int no;//학번
	String name;
	String className;//학급
	
	static String schoolName;//클래스 변수
	
	static { //static변수들의 초기화를 수행하는 블럭
		schoolName="멀티캠퍼스";
	}//static initializer
	
	//[1] getInfo()구성하기  반환타입: String
	public String getInfo() {
		
		String str="---학생 정보-----\n";
			str+="학번: "+no+"\n";
			str+="이름: "+name+"\n";
			str+="학급: "+className+"\n";
			
		return str;
	}
	
	//[2] 기본생성자 구성해서 기본값 할당하기
	//개발자가 생성자를 구현하지 않으면 디폴트 생성자가 제공된다
	//하지만 하나라도 구성하게 되면 제공되던 디폴트 생성자는 사라진다.
	public Student() {
		no=100;
		name="이학생";
		className="자바반";
	}
	
	//[3] 인자생성자 구성해서 멤버변수 초기화하기
	public Student(int n, String nm, String cn) {
		no=n;
		name=nm;
		className=cn;
	}
	
	
	
}
