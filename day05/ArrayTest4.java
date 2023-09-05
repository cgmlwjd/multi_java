package day05;
import java.util.*;

public class ArrayTest4 {
	public static void main(String[] args) {
		
		String[] subject = {"국어", "영어", "수학", "과탐", "사탐"};
		
		int[] jumsu = new int[subject.length];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.println(subject[i] + "점수 입력: ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		avg = sum / jumsu.length;
		
		/*국어	영어		수학		과탐		사탐
		 * ----------------------------------
		 * 
		 * ----------------------------------
		 * 총합계 점수:
		 * 평 균 점 수:
		 * 
		 * */

		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		
		System.out.println("\n********************************");
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + "\t");
		}
		
		System.out.println("\n********************************");
//		System.out.println("총 합계 점수: " + sum);
//		System.out.println("평균 점수 : " + avg);
		System.out.printf("총 합계 점수: %3d\n", sum);
		System.out.printf("평 균 점 수 : %.2f점\n", avg);
		System.out.println("\n********************************");
		sc.close();
	}

}
