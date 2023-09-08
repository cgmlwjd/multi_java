package day07;

public class School2 {

	public static void main(String[] args) {
		// Teacher객체 2개 생성해서
		//값 할당하고
		//printInfo()호출해보기
		Teacher t1=new Teacher();
		t1.printInfo();
		
		t1.setNo(1);
		t1.setName("김교사");
		t1.setSubject("자바");
		t1.setGender('F');
		String n=t1.getName();
		System.out.println(n);
		
		t1.printInfo();
		
		Teacher t2=new Teacher();
		t2.setNo(2);
		t2.setName("최교사");
		t2.setSubject("파이썬");
		t2.setGender('M');
		
		t2.printInfo();
		
		
		//[1] t1, t2를 저장할 배열을 선언하고, 메모리 할당한 뒤 초기화하세요
		Teacher[] arr=new Teacher[2];
		System.out.println("arr[0]="+arr[0]);
		
		arr[0]=t1;
		arr[1]=t2;
		
		
		//[2] for루프 이용해서 배열에 저장된 교사들의 정보를 출력하세요
		System.out.println("*******************");
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			/*Teacher tc=arr[i];
			tc.printInfo();*/
			arr[i].printInfo();
		}
		

	}

}

