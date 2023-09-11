package day09;
/* 예외처리방법
 * [1] 직접 handle 하는 방법
 * try - catch절을 이용
 * [2] 선언(declare)하는 방법
 * throws 절을 이용
 * */

public class ExceptionTest1 {
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Grape", "Orange"};
		try {
			for(int i = 0; i <= 3; i++) {
				System.out.println(fruits[i]);
			} //for---
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 초과되었어요! 확인해주세요");
		}
		System.out.println("##반드시 실행되어야 할 코드##");
	}
}
