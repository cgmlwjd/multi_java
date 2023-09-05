package day05;

/*자료형
1. Primitive Type
2. Reference Type ==> new 연산자 객체 생성해서 초기화
	- 클래스형
	- 배열
	- 인터페이스형
	- 열거형



배열
-동종의 데이터만 저장 가능
- 고정 크기

int a[]={10,20,'A'}
a[0]
a[3] ==>[x]

[1] 선언
[2] 메모리할당
[3] 초기화

//1)
int []arr;
int arr[];

arr=new int[5];//2)
//3)
arr[0]=10; arr[1]=20;
arr[2]=30;...
 * */

public class ArrayTest {

	public static void main(String[] args) {
		// 1) 선언
		// int[] arr 1차원배열
		int arr[];
		
		//2) 메모리 할당
		arr = new  int[3]; //배열의 크기는 3
		
		//3) 초기화
		arr[0] = 10;
		arr[1] = 15;
		arr[2]=20;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		double b[] = new double[4];
		System.out.println("b[0] = " + b[0]);
		System.out.println("b[3] = " + b[3]);
		
		b[0] = .127;
		b[1] = 30e-2;
		b[2] = 20;
		b[3]='A';
		
		System.out.println("b[0] = " + b[0]);
		System.out.println("b[3] = " + b[3]);
		
		System.out.println("b.length = " + b.length);
		System.out.println("arr.length = " + arr.length);
		
		//1, 2, 3 선언과 동시에 메모리 할당 및 초기화
		char[] c= {'J', 'a', 'v', 96};
		System.out.println("c.length");
		System.out.println(c[0]);
		System.out.println(c[3]);
		System.out.println("****************");
		
		//for루프문을 이용하여 c에 적정한 값 한꺼번에 출력
		
		for(int i=0; i<4; i++) {
			System.out.println(c[i]);
		}
		//for루프 이용해서 b에 저장된 값 출력하기
		for(int i = 0; i < 4; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@");
		
		//for each loop문 - 확장 for 루프
		/*
		 * for(변수선언문: 자료구조){
		 * }
		 * */
		
		for(double val:b) {
			System.out.println(val);
		}
		
		//c도 for each문을 이용해 출력해보기
		for(char ch:c) {
			System.out.println(ch);
		}
		//arr도 for each문을 이용해 출력해보기
		for(int x :arr) {
			System.out.println(x);
		}
		
		/*[문제1]
		 * 이름을 저장할 배열을 선언,메모리할당, 초기화 단계를 거처 생성하세요
		 * 
		 * */
		String[] names;
		names = new String[5];
		System.out.println("names[0] = " + names[0]);
		names[0] = "홍길동";
		names[1] = "송영희";
		names[2] = new String("정미남");
		names[3] = "박순희";
		names[4] = new String("장길동");
		
//		[문제2] for루프문 이용해 한꺼번에 출력
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
//		[문제3] for  each루프문 이용해 한꺼번에 출력
		for(String name: names)
			System.out.println(name);
	}

}
