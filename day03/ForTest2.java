package day03;

public class ForTest2 {
	public static void main(String[] args) {
		//[1]for루프 이용해서 1~10까지의 합과 곱을 구해 출력하세요
		//1+2+3+....+10=55
		//1*2*3* ....*10=3628800
		int sum = 0;
		int mul = 1;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			mul *= i;
//			if(i == 10) {
//				System.out.printf(i + " = ");
//			}
//			else {
//				System.out.printf(i+ " + ");
//			}
			System.out.print((i<10)?i + " + ": i + " = ");
		}
		System.out.println(sum);
		System.out.println(mul);
		//[2] 1~20까지 정수 중 2 또는 3의 배수가 아닌 수를
		//출력하고, 이 수들의 총합을 구하세요
		int sum2 = 0;
		for(int j = 1; j <= 20; j++) {
			if(j%2 != 0 && j%3 != 0) {
				sum2 += j;
//				System.out.print(j + ", ");
				System.out.print((j<19)? j + "+":j + "=");
			}
			
		}
		System.out.println(sum2);
		//[3] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기
		for(int i = 0; i < 26; i++) {
			System.out.print((char)('A'+i)+", ");
		}
		System.out.println();
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
	}

}
