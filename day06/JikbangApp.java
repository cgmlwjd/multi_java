package day06;

public class JikbangApp {
	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();
		
//		System.out.println("h1.owner: " + h1.owner);
//		System.out.println("h2.owner: " + h2.owner);
		
		h1.owner="홍길동";
		h1.room=3;
		h1.addr = "서울 강남구 역삼동";
		
		h2.owner="김철수";
		h2.room=2;
		h2.addr = "서울 마포구 역삼동";
		
		System.out.println("h1.owner: " + h1.owner);
		System.out.println("h2.owner: " + h2.owner);
		
		h1.printInfo();
		h2.printInfo();
//		System.out.println(h1);
//		System.out.println(h2);
		
		 House h3 = new House();
		 h3.owner="김영희";
		 h3.room=5;
		 h3.addr="인천";
		 
		 h3.printInfo();
		 
		 String info = h3.rent("전세", 5000);
		 System.out.println(info);
		 
		 String info2 = h1.rent("월세", 30);
		 System.out.println(info2);
		 
		 System.out.println(h2.rent("매매", 8000)); 
		 
		
	}

}
