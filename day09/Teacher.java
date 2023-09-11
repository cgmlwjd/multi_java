package day09;
//Person 상속받아서, 컴파일문제 없도록 코드 완성
//toString()오버라이드하기
public class Teacher extends Person {
	String subject;
	
	public Teacher(int no, String name, String addr, String sub) {
		super(no, name, addr);
		subject = sub;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [subject = " + subject + ", no = " + no + ", name = " + name + ", address = " + addr + "]"; 
	}
	
	public String toString(String title) { //Overload
		return "####" + title + "####\n" + this.toString();
	}
}
