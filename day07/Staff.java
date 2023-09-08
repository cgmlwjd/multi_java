package day07;

public class Staff {
	
	private int no;//사번
	private String name;//이름
	private String dept;//부서
	private int sal;//급여
	
	private static int count=0;//직원수
	
	private static int totalSal=0;//총급여
	
	//기본생성자 구성해서 멤버변수 초기화하기
	public Staff() {
		no=1000;
		name="이순신";
		dept="기획부";
		sal=8000;
		count++;
		totalSal+=sal;
	}
	//인자생성자 구성해서 멤버변수 초기화하기
	public Staff(int no, String name, String dept, int sal) {
		this.no=no;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		count++;
		totalSal+=sal;
	}
	
	public static int getCount() {
		return  count;
	}
	//getTotalSal()구성하기
	public static int getTotalSal() {
		return Staff.totalSal;
	}
	
	//getAvg() 구성하기
	public static double getAvg() {
		return (double)totalSal/count;
	}
	
	
	public void printInfo() {
		System.out.println("---사원 정보-----");
		System.out.printf("사 번: %d%n", no);
		System.out.printf("이 름: %s%n", name);
		System.out.printf("부 서: %s%n", dept);
		System.out.printf("급 여: %d%n", sal);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	//setter, getter----------------

}
