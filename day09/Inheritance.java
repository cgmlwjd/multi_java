package day09;

public class Inheritance {
	public static void main(String[] args) {
		Person p1 = new Person(1, "홍길동", "서울");
		System.out.println(p1);
		
		Object p2 = new Person(2, "김객체", "부산");
		System.out.println(p2);
		
		Student s1 = new Student(100, "이철수", "서울", "자바반");
		System.out.println(s1);
		
		Person s2 = new Student(101, "김영희", "인천", "파이썬반");
		System.out.println(s2);
		
		Object s3 = new Student(102, "최객체", "수원", "자바반");
		System.out.println(s3);
		
		Teacher t1 = new Teacher(200, "송교사", "서울", "C");
		System.out.println(t1);
		
		Person t2 = new Teacher(201, "최교사", "부산", "Java");
		System.out.println(t2);
		
		//p1, s1, s2, t1, t2 객체를 저장할 배열을 선언하고 메모리 할당한 뒤 저장하기
//		Person[] arr = new Person[5];
//		arr[0] = p1;
//		arr[1] = s1;
		
		Person[] arr = {p1, s1, s2, t1, t2, (Person)p2};
		
		//for루프 이용해서 한꺼번에 정보 출력하기
		//instanceof 연산자 ==> boolean을 변환
		//참조변수 instanceof 클래스명: 변수가 클래스의 객체면 true, 아니면 false변환
		for(Person ps:arr) {
//			System.out.println("**********");
			if(ps instanceof Teacher) {
				System.out.println(((Teacher)ps).toString("교사정보"));
			} else {
				System.out.println("**********");
				System.out.println(ps);
			}
			
		}
	}

}
