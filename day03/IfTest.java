package day03;

import java.util.*;
public class IfTest {
	public static void main(String[] args)
	throws Exception
	{
		System.out.println("이름 입력: ");
		/* int n = System.in.read();
		System.out.println("n: "+n);
		System.out.println("n: "+(char)n); */
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Name: "+name);
		
		System.out.println("생년 입력: ");
		int age = sc.nextInt();
		System.out.println(age+"년에 태어났군요~");
		
		/* if(조건식){
		 * 		실행문;
		 * }
		 * 실행문2;
		 * */
		
		if(age % 2 == 0) {
			System.out.println("짝수년도에 태어났군요");
			System.out.println("################");
		}
		else {
			System.out.println("홀수년도에 태어났군요");
		}
		
	}

}
