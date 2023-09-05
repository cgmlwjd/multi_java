package day05;
import java.util.*;

public class Exam02 {
	public static void main(String[] args) {
		int cnt1=0;
		int cnt2=0;
		String str="";
		int[] jumsu = new int[10000];
		Random ran = new Random(10);
		int sum=0;
		//1만명의 수능점수를 랜덤하게 저장하세요
		// 수능점수 0<=score < 451
		for(int i = 0; i < jumsu.length; i++) {
			jumsu[i] = ran.nextInt(451);
			if(jumsu[i] == 450) {
				cnt1++;
				str += i+"번, ";
			} else if(jumsu[i] == 0) {
				cnt2++;
			}
			sum += jumsu[i];
		}
		
		double avg = (double)sum/jumsu.length;
		System.out.println("만점자: " + cnt1+ "명");
		System.out.println("0점자: " + cnt2 + "명");
		System.out.println("-----------------------");
		System.out.println("만점자 번호: " + str);
		System.out.println("-----------------------");
		System.out.println("평균점수: " + String.format("%.2f", avg)+"점");
		
		//4번
		int cnt3=0;
		for(int score:jumsu) {
			if(score >= avg-50 && score <= avg + 50) {
				cnt3++;
			}
		}
		System.out.println("평균점수 +-50인 인원수: " + cnt3 + "명");
		
	}

}
