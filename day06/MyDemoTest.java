package day06;


public class MyDemoTest {

	public static void main(String[] args) {
		
		// [1] MyDemo의 showSnail()호출해보기
		MyDemo.showSnail();
		
		// [2] MyDemo의 showStar()호출해보기
		//MyDemo.showStar(); [x]
		MyDemo my=new MyDemo();
		my.showStar();
		
		//java.lang.Math  pow() 메서드 찾아서 호출해보기
		//7의 3승값을 출력해보세요
		//static double	pow(double a, double b)
		double x=Math.pow(2, 3);
		System.out.println("2의 3승: "+ (int)x);
		x=Math.pow(7.0, 3.0);
		System.out.println("7의 3승: "+x);
		
		//java.lang.String 클래스의 split() 호출해보기
		//String[]	split(String regex)
		String str="Java#JSP#Spring#Android";
		
		String str2=new String("Oracle#MySQL#Infomix@SQLServer");
		
		//str을 '#'기준으로 쪼개서 배열로 반환받고, 해당 배열을 for each문 이용해 출력하세요
		
		String[] arr=str2.split("@");
		for(String tk:arr) {
			System.out.println(tk);
		}
		
		//MyDemo의 showShape()호출하기
		MyDemo.showShape('♥', 30);
		MyDemo.showShape('♥', 20);
		MyDemo.showShape('♥', 10);
		
		MyDemo.showShape('$', 50);
		//MyDemo의 greeting()호출하기
		
		MyDemo md=new MyDemo();
		md.greeting("즐거운 하루 되세요~~", "수지");
		
		md.greetingMany("반가워요~~", "수지","영희","민철");
		md.greetingMany("잘가세요~~", "다니엘","제인","톰","알버트","피터");
		
		//YourDemo의 add()
		//			multi()
		//			div()
		YourDemo yd=new YourDemo();
		int res=yd.add(111, 222);
		System.out.println(res);
		
		//double res2=yd.multi(3.12, 5.78f);
		float res2=(float)yd.multi(3.12, 5.78f);
		System.out.println(res2);
		
		float res3=YourDemo.div(10L, (short)2);
		System.out.println(res3);
		
	}

}