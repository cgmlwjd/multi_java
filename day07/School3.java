package day07;

public class School3 {

	public static void main(String[] args) {
		// Staff객체 3개 생성하기
		Staff sf1=new Staff();
		//printInfo()호출하기
		sf1.printInfo();
		
		Staff sf2=new Staff(1001,"최영","홍보부",7000);
		sf2.printInfo();
		
		//System.out.println(sf2.name); [x]
		System.out.println(sf2.getName());
		sf2.setName("최영길");
		
		sf2.printInfo();
		
		Staff sf3=new Staff(1002,"김미나","교육부",9000);
		sf3.printInfo();
		System.out.println("총 직원 수: "+sf1.getCount());
		System.out.println("총 직원 수: "+sf2.getCount());
		System.out.println("총 직원 수: "+sf3.getCount());
		System.out.println("총 직원 수: "+Staff.getCount());
		System.out.println("총 합계 급여: "+Staff.getTotalSal());
		System.out.println("평균 급여 : "+ Staff.getAvg());
	}

}
