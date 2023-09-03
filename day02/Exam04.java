package day02;

public class Exam04 {
	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		int sum = x + y;
		System.out.println("sum: "+ sum);
		
		int count= 7;
		System.out.println(sum/count);
		double avg = sum/count;
		System.out.println(avg);
		
		double avg2 = (double)sum/count;
		System.out.println(avg2);
	}
}
