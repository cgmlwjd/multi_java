package day05;
import java.util.*;

public class ArrayTest2 {

	public static void main(String[] args) {
		int x[] = {1, 2, 3, 4};
		int []y; //배열 선언
		int []z = {100, 200};
		y=x;
		System.out.println("x: "+x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		
		//for루프 이용해서 x에 저장된 값 출력
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		//for each 이용해서 y에 저장된 값 출력
		for(int val:y) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		y[2] = 300;
		System.out.println("y[2] = " + y[2]);
		System.out.println("x[2] = " + x[2]); 
		
		int []a = {10, 20};
		int b[] = {9, 8, 7, 6};
		int tmp[];
		
		//[1] a와 b의 배열을 서로 바꿔 참조하도록 해보기 swap
		tmp=a;
		a=b;
		b = tmp;
		
		for(int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
		
		//[2] 요소 4개는 갖는 double 타입의 배열을 선언하여 초기화하세요.
		 //    그런 다음 이 배열 요소들의 평균값을 구해 출력하기
		double[] arr = new double[4];
		arr[0] = 1.23;
		arr[1] = -7.56;
		arr[2] = 50.41;
		arr[3] = 80;
		
		double sum = 0.0;
		for(double val:arr) {
			System.out.print(val + ", ");
			sum += val;
		}
		System.out.println("\n총합: " + sum);
		double avg = sum/arr.length;
		System.out.println("평균: " + avg);
		
		//[3] float타입의 배열 요소를 받아들이는
		//			배열을 선언하고 크기는 3만큼 잡는다.
		//			인덱스0에는 -16.1을 넣어주고,
		//			인덱스1에는 200.1
		//			인덱스 2에는 30E-7의 값을 넣어주자.
	 	// 반복문 이용해 저장된 값을 출력하세요
		
		float xx[]= {-16.1f, 200.1f, 30e-7f};
		for(float yy:xx) {
			System.out.println(yy);
		}
		
		String[] str = {"Hello" , String.valueOf(10), new String("Java"), "Bye~~", 3.14+""};
		Object[] obj = new Object[4];
		System.out.println(obj[0]);
		String s1 = "Hi~~ I'm String";
		obj[0] = new Object();
		obj[1] = new String("나는 문자열!");
		obj[2] = new Random();
		obj[3] = new Date();
		
		//for루프 이용해 obj 저장된 값 출력하기
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}
		//for each루프 이용해 obj 저장된 값 출력해보기
		System.out.println("*******************");
		for(Object o:obj)
			System.out.println(o);
		
	}
}
