package day07;

public class CompanyApp {

	public static void main(String[] args) {
		//Employee 2개 생성
		Employee e1 = new Employee();
		//printInfo() 호출해보기
		e1.printInfo();
		
		Employee e2 = new Employee();
		
		e2.no=2;
		e2.name="김시원";
		e2.dept="노무부";
		e2.salary=7000;
		
		e2.printInfo();
		
		Employee e3 = new Employee(3, "홍길동", "기획부", 7500);
		Employee e4 = new Employee(4, "최철수", "교육부", 8500);
		
		e3.printInfo();
		e4.printInfo();

	}

}
