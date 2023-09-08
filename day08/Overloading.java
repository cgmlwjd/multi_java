package day08;

public class Overloading {

	public static void main(String[] args) {
		Superman s1=new Superman("아무개슈퍼맨",177,100);
		System.out.println(s1.showInfo());

		Superman s2=new Superman();
		System.out.println(s2.showInfo());
		
		Superman s3=new Superman("김정국");
		System.out.println(s3.showInfo());
		
		Superman s4=new Superman("홍길동",180);
		System.out.println(s4.showInfo());
		
		Aquaman a1=new Aquaman();
		System.out.println(a1.showInfo());
		
		Aquaman a2=new Aquaman("인어공주",170, 50);
		System.out.println(a2.showInfo());
		
		Aquaman a3=new Aquaman(150,80.12,"고등어");
		System.out.println(a3.showInfo());
		
		//슈퍼맨 객체를 저장할 배열을 생성하고,  s1,s2,s3를 저장하세요
		//for or for each loop를 이용해서 한꺼번에 정보 출력하세요
		System.out.println("****************************");
		Superman [] arr= {s1, s2, s3, s4};
		for(int i=0;i<arr.length;i++) {
			Superman man=arr[i];
			System.out.println(man.showInfo());
		}
		
		
		
		//아쿠아맨 객체를 저장할 배열을 생성하고,  a1,a2,a3를 저장하세요
		//for or for each loop를 이용해서 한꺼번에 정보 출력하세요
		Aquaman [] arr2=new Aquaman[3];
		arr2[0]=a1;
		arr2[1]=a2;
		arr2[2]=a3;
		
		for(Aquaman man:arr2) {
			System.out.println(man.showInfo());
		}
		
	}

}