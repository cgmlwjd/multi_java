package day02; //패키지 선언문

//java.lang => 기본패키지 => 생략을 해도 자동으로 import해준다.
//import java.lang.System;
//import java.util.Date;
//import java.util.Random;
import java.util.*;

//클래스 선언문
//public class: 클래스명{}
//클래스명: 명사형, 대문자로 시작, camel표기
//클래스명과 파일명은 반드시 같아야한다. (대소문자도 같아야함)
public class Hello {
	
	//main() ==> 실행 프로그램이 된다.
	public static void main(String[] args) {
		System.out.println("Hello java!");
		Date today = new Date(); //객체 생성
		System.out.println(today);
		
		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println("num: " + num);
		
		System.out.println("당신의 이름을 입력해주세요 => ");
		Scanner sc = new Scanner(System.in);
		//System.in: 표준입력장치와 연결되어있다.
		//System.out: 표준 출력 장치
		String name=sc.next(); //문자열을 입력받는다.
		System.out.println("name: " + name);
		
	}

}
