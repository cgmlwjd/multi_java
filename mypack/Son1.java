package mypack;

public class Son1 extends Parent {
	
	public void go() {
		System.out.println("publicVar: " + publicVar);
		System.out.println("protectedVar: " + protectedVar);
		System.out.println("defaultVar: " + defaultVar);
		//System.out.println("privateVar: " + privateVar);
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Son1's show: $$$$");
	}
	
	public static void main(String[] args) {
		//go 호출하기
		Son1 s = new Son1();
		s.go();
		s.show();
	}

}
