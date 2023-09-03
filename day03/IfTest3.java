package day03;
//scanner로
import java.util.*;
public class IfTest3 {
	public static void main(String[] args) {
		// 평균점수를 이용한 학점
		/* 100 ~90 : A
		 * 89 ~ 80 : B
		 * 79 ~ 70 : C
		 * 69 ~ 80 : D
		 * 그 외: F
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 -> ");
		float kor = sc.nextFloat();
		
		System.out.println("영어 점수 -> ");
		float eng = sc.nextFloat();
		
		float sum = kor + eng;
		float avg = sum / 2;
		
		char grade; //지역변수(local variable)은 초기화를 한 뒤 사용해야됨
		//ex) char grade = 'A';
		
		if(avg >= 90) {
			grade = 'A';
		}
		else if(avg >= 80 && avg < 90) {
			grade = 'B';
		}
		else if(avg >= 70 && avg < 80) {
			grade = 'C';
		}
		else if(avg >= 60 && avg < 70) {
			grade = 'D';
		}
		else {
			grade='F';
		}
		
		//성적 테이블 형태로 출력
		/* ---------------------
		 * 국어       수학
		 * ---------------------
		 * 85.3       92.5
		 * ---------------------
		 * 합계 점수 : xx점
		 * 평균 점수 : 
		 * 학 	  점 : B
		 * */
		
		System.out.println("------------------");
		System.out.println("국어\t수학");
		System.out.println("------------------");
		System.out.printf("%.1f\t%.1f\n", kor, eng);
		System.out.println("---------------");
		System.out.println("합계 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
		System.out.println("학\t점 : " + grade);
		System.out.println("------------------");
		
		String str = "------------------\n";
			   str += "국어\t영어\t\t\n";
			   str += "------------------\n";
			   
			   str += kor+"\t"+eng+"\t\t\n";
			   str += "------------------\n";
			   str += "총점: " + sum +"점\n";
			   str += "평균: " + avg +"점\n";
			   str += "학점: " + grade +"점\n";
			   str += "------------------\n";
		System.out.println(str);
		
		
	}

}
