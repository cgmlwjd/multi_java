package day02;
//150p 4번, JOptionPane() 활용
//		5번, Exam03.java 활용
import javax.swing.*;

public class Exam02 {
	public static void main(String[] args) {
		int ath = Integer.parseInt(JOptionPane.showInputDialog("1학기 체육 성적 입력"));
		int math = Integer.parseInt(JOptionPane.showInputDialog("1학기 수학 성적 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("1학기 영어 성적 입력"));
		int kor = Integer.parseInt(JOptionPane.showInputDialog("1학기 수학 성적 입력"));
		
		int total = ath + math + eng + kor;
		
		System.out.printf("모든 점수의 합은 %d점 입니다.\n", total);
		System.out.printf("평균은 %d점 입니다.", total/4);
		
	}

}
