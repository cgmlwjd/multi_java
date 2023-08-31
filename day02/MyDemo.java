package day02;

public class MyDemo {
	public static void main(String[] args) {
		System.out.println("My Demo~");
		/*escape 문자
		 * \n : 개행문자 (줄바꿈이 일어난다)
		 * \t : 탭 키 만큼 띄어쓰기를 한다
		 * \" : 쌍따옴표를 출력하고자 할 때 사용
		 * \' : 홑따옴표
		 * \\ : 역슬래시(\)를 출력하고자 할때
		 * \r : 캐리지리턴. 커서를 맨 앞으로 이동시킨다
		 * */
		
		System.out.println("-----------------");
		System.out.println("국어\t영어\t수학");
		System.out.println("-----------------");
		System.out.println("98\t87\t65");
		System.out.println("------------------");
		
		System.out.println("김소월 님의 \'진달래 꽃\'");
		System.out.println("\"나보기가 역겨워 가실 때에는\"");
		
		System.out.println("역슬래시(\\)");
		System.out.println("helloworld!\rA");
		System.out.println("*************");
		
		/* %d : 정수형식으로 출력
		 * %f : 소수점 형식으로 출력
		 * %s : 문자열 형식으로 출력
		 * %c : 문자
		 * %b : boolean형식으로 출력
		 * %n : 줄바꿈
		 * */
		
		System.out.printf("제 이름은 %s이고, 제 나이는 %d입니다.%n", "홍길동", 22);
		
		System.out.printf("제 평균성적은 %d점 입니다.\n", 93);
		System.out.printf("평균성적: %.2f점\n", 93.88882);
		
		System.out.printf("%4d%n", 1);//4자리를 차지하고 1을 출력
		System.out.printf("%4d%n", 10);//4자리를 차지하고 1을 출력
		System.out.printf("%4d%n", 100);//4자리를 차지하고 1을 출력
		//-를 사용하면 왼쪽 정렬이 된다
		System.out.printf("%-4d%n", 1);//4자리를 차지하고 1을 출력
		System.out.printf("%-4d%n", 10);//4자리를 차지하고 1을 출력
		System.out.printf("%-4d%n", 100);//4자리를 차지하고 1을 출력
		//0을 이용하면 오른쪽 정렬을 하면서 남은 공간의 왼쪽 자리는 0으로 채운다
		System.out.printf("%04d%n", 100);
		//4자리를 차지하고 100을 출력하고 앞에 남은 공간을 0으로 채운다
		
	}
}
