package day02;

public class Exam05 {
	public static void main(String[] args) {
		double pi = 3.14;
		double r = 2.2;
		double circle = pi*r*r;
		
		String circle1 = String.format("%.2f", circle);
		System.out.println("원의 면적은: "+ circle1);
	}

}
