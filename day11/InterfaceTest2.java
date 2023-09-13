package day11;

public class InterfaceTest2 {
	public static void main(String[] args) {
		MyDemo md = new MyDemo();
		md.a();
		md.b();
		md.c();
		md.d();
		System.out.println(MyDemo.PI);
		
		Inter1 nl1 = new MyDemo();
		nl1.a();
		nl1.b();
		
		Inter3 nl2 = new MyDemo();
		nl2.c();
		
		AbsClass ac = new MyDemo();
		ac.info();
		ac.d();
		((MyDemo)ac).a();
		System.out.println(Inter2.PI);
	}

}
