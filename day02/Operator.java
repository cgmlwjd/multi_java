package day02;

public class Operator {
	public static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Operator.print("---연산자---");
		print("1. 산술 연산자");
		int a = 5;
		int b = 2;
		System.out.println(a/b);
		System.out.println(a%b);
		
		int x = 50;
		long y=2;
		long z=x+y;
		double k=x*y;
		System.out.println(z);
		System.out.println(k);
		
		print("2. 증감연산자");
		int c=8;
		int d=5;
		c++;
		print("c: "+c);
		++c;
		print("c: "+c);
		--d;
		print("d: "+ d);
		d--;
		print("d: "+d);
		
		float e=5.6f;
		double f=8.5f;
		System.out.println(++e);
		System.out.println(e++);
		
		System.out.println("e: "+e);
		
		System.out.println(--f);
		System.out.println(f--);
		System.out.println("f: "+f);
		
		print("3. 논리부정 연산자");
		boolean b1 = false;
		print("b1: " + b1);
		print("!b1: " + !b1);
		
		print("4. 비교연산자");
		/* = : 대입연산자
		 * == : 비교연산자 
		 * ===: 자바에는 없다[x]
		 * 비교연산자(==)
		 * [1] 기본자료형 : 값이 같은지를 비교함
		 * [2] 참조형 : 주소값이 같은지를 비교한다
		 * 
		 * != : 값이 서로 다른가? 다르면 true
		 * */
		
		int x1 = 7;
		float y1=7.0f;
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4= new String("Hello");
		String s5 = s4;
		
		print("x == y: "+ (x1==y1));
		print("s1 == s2: " + (s1 == s2));
		
		print("s1 == s3: " + (s1 == s3));
		
		print("s2 == s4: " + (s2 == s4));
		print("s5 == s4: " + (s5 == s4));
		
		print("s2.equals(s4): " + (s2.equals(s4)));
		
		
	}

}
