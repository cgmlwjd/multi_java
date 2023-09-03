package day02;

import javax.swing.JOptionPane;

public class Exam2_re {
	public static void main(String[] args) {
		String ath = JOptionPane.showInputDialog("1학기 체육 성적 입력");
		String math = JOptionPane.showInputDialog("1학기 수학 성적 입력");
		String eng = JOptionPane.showInputDialog("1학기 영어 성적 입력");
		String kor = JOptionPane.showInputDialog("1학기 수학 성적 입력");
		
//		if(ath.equals("")) {
//			System.out.println("점수를 입력하세요");
//			return;
//		}
//		
//		if(ath == null) {
//			System.out.println("체육점수 null");
//			return;
//		}
		
		if(ath == null || ath.equals("")) {
			System.out.println("점수를 입력하세요");
			return;
		}
		
//		if(math.equals("")) {
//			System.out.println("점수를 입력하세요");
//			return;
//		}
//		
//		if(math == null) {
//			System.out.println("체육점수 null");
//			return;
//		}
//		
//		if(eng.equals("")) {
//			System.out.println("점수를 입력하세요");
//			return;
//		}
//		
//		if(eng == null) {
//			System.out.println("체육점수 null");
//			return;
//		}
//		
//		if(kor.equals("")) {
//			System.out.println("점수를 입력하세요");
//			return;
//		}
//		
//		if(kor == null) {
//			System.out.println("체육점수 null");
//			return;
//		}
		
		if(math == null || math.equals("")) {
			System.out.println("점수를 입력하세요");
			return;
		}
		
		if(eng == null || eng.equals("")) {
			System.out.println("점수를 입력하세요");
			return;
		}
		
		if(kor == null || kor.equals("")) {
			System.out.println("점수를 입력하세요");
			return;
		}
		
		System.out.println("체육 점수: "+ath);
		int ath_int = Integer.parseInt(ath);
		
		System.out.println("수학 점수: "+ath);
		int math_int = Integer.parseInt(math);
		
		System.out.println("영어 점수: "+ath);
		int eng_int = Integer.parseInt(eng);
		
		System.out.println("국어 점수: "+ath);
		int kor_int = Integer.parseInt(kor);
		
		
	
		int total = ath_int  + math_int + eng_int + kor_int;
		
		System.out.printf("모든 점수의 합은 %d점 입니다.\n", total);
		System.out.printf("평균은 %d점 입니다.", total/4);
		
	}

}

