package com.my;
//Ctrl + +: 글씨 키우기
// java: 컴파일 + 인터프리터
//클래스 이름: 명사형, 대문자로 시작
//클래스 명과 파일명은 같아야한다.
//HelloWorld.java

public class HelloWorld {
	//main(): 프로그램의 시작점이면서 끝점
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//system.out: 시스템의 표준출력 장치와 연결되어 있다. => Console
		//[1] 컴파일: javac -d . HelloWorld.java ==> 이클립스는 저장(ctrl+s)하면 자동으로 컴파일을 해준다.
		//컴파일을 하면 byte code(JVM이 이해할 수 있는 코드)로 번역된다 ==> HelloWorld.class
		//[2] 인터프리터: java 패키지명.HelloWorld
		//		==> HelloWorld.class파일을 읽어서 해석한 뒤 아웃풋을 내라는 의미
		//			인터프리터는 main() 메서드를 찾아 한 줄 한 줄 해석하고 결과를 낸다.
		
		System.out.println("안녕하세요? 저는 백엔드");
		System.out.println("개발자 과정을 듣는 홍길동입니다.");
		System.out.println("Bye Bye~~");
	} //main() 메서드 끝
} //class 끝
