package day07;

public class Teacher {
	
	private int no;//교번
	private String name;
	private String subject;//과목
	private char gender;//'F','M'
	
	//[1] void printInfo() 구성하기
	public void printInfo() {
		System.out.println("----교사 정보------");
		System.out.println("교번: "+this.no);
		System.out.println("이름: "+this.name);
		System.out.println("과목: "+subject);
		System.out.println("성별: "+gender);
	}
	//[2] 멤버변수들을 캡슐화하세요
	//[3] setter, getter구성하세요
	/*
	 * 지역변수: no
	 * 멤버변수: no
	 * 지역변수가 우선순위가 높다
	 * 변수의 이름이 동일할 경우, 멤버변수와 지역변수를 구분하기 위해
	 * 멤버변수 앞에는 this를 붙인다 => "this.변수"
	 * ****************************************************
	 * this.변수 : 자기 객체의 인스턴스변수를 참조할 때 this를 붙인다.
	 * this.메서드(): 자기자신의 인스턴스 메서드를 호출할 때
	 * this() : ==> 자기자신의 생성자를 호출할 때
	 * 
	 * [주의] static메서드 안에서는 this 키워드는 사용할 수 없다
	 * ****************************************************
	 * */
	public void setNo(int no) {
		//no=no;
		//지역변수=지역변수
		
		this.no = no;
		//멤버변수 = 지역변수;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSubject() {
		return subject;
	}
	public char getGender() {
		return gender;
	}
	

}
