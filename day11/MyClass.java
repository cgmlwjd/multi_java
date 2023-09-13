package day11;
//MyClass가 MyInter, YourInter를 상속받아보자
//클래스가 인터페이스를 상속받을 때는 implements로 상속받으며,
//다중 상속이 가능하다

public class MyClass implements MyInter, YourInter 
{
	@Override
	public void foo() {
		System.out.println("foo()###");
	}
	
	@Override
	public String bar() {
		return "bar()$$$$";
	}
	
	
	public static void main(String[] args) {
		//MyClass객체를 생성해서 foo(), bar()를 호출하기
		MyClass mc=new MyClass();
		mc.foo();
		String s=mc.bar();
		System.out.println(s);
		//GREETING 출력하기
		System.out.println(mc.GREETING);
		System.out.println(MyClass.GREETING);
		System.out.println(YourInter.GREETING);
		//mc.GREETING="Hello"; [x]
		
		//MyInter mi=new MyInter();//[x]
		MyInter mi=new MyClass();
		YourInter yi=new MyClass();
		
		//mi를 이용해서  foo(), bar(), GREETING 출력해보기
		mi.foo();
		//mi.bar();//[x]
		//System.out.println(mi.GREETING);//[x]
		
		//yi를 이용해서  foo(), bar(), GREETING 출력해보기
		((MyClass)yi).foo();
		((MyInter)yi).foo();
		
		System.out.println(yi.bar());
		System.out.println(yi.GREETING);
		
	}

}
