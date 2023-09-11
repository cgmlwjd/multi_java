package day09;
//부모 클래스
public class Person { //extends Object
	
	int no;
	String name;
	String addr;
	
//	public Person() {
//		this(0, "", "");
//	}
	
	public Person(int no, String name, String addr) {
		this.no = no;
		this.name = name;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Person [no = " + no + ", name = " + name + ", address = " + addr + "]"; 
	}
	
}
