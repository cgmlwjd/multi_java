package day07;

public class School {

	public static void main(String[] args) {
		// 객체 생성해서 getInfo()호출해보기
		Student s1=new Student();
		
		String info=s1.getInfo();
		System.out.println(info);
		
		Student s2=new Student(200,"이민영","빅데이터반");
		System.out.println(s2.getInfo());
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		
		Student.schoolName="멀티캠퍼스 K디지털";
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
	}

}
