package day07;

public class Employee {
	int no;
	String name;
	String dept;
	double salary;
	
	public Employee() {
		no =1;
		name="아무개";
		dept="인사부";
		salary=5000;
	}
	//입자 생성자 ,argument constructor
	public Employee(int n, String nm, String dp, double sal) {
		no=n;
		name=nm;
		dept=dp;
		salary=sal;
	}
	
	public void printInfo() {
		System.out.println("----사용정보----");
		System.out.println("No: " + no);
		System.out.println("Name: " + name);
		System.out.println("Dept: " + dept);
		System.out.println("salary: " + salary);
		
	}

}
