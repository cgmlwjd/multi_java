package day03;
/*반복문
 * 1) for 루프
 * 2) while 루프
 * 3) do ~ while 루프
 * */
public class ForTest {
	public static void main(String[] args) {
		/*for(변수선언문; 조건문; 증감식_}
		 * 		실행문;
		 * }
		 * for(;;){} == 무한루프
		 * */
		for(int i = 1; i < 6; i++) {
			System.out.println("Hello: " + i);
		}
		System.out.println("********");
		
		int j = 10;
		for(; j > 5; j--) {
			System.out.println("Java: " + j);
		}
		System.out.println("@@@@@@@@"+j);
		
	}

}
