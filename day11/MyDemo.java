package day11;
interface Inter1{
	void a();
	int b();
}///////////////////
interface Inter2{
	
	double PI=3.14;
	
}///////////////////
//인터페이스가 인터페이스를 상속받을 때는 extends로 받으며, 여러 개 상속 가능하다
interface Inter3 extends Inter1, Inter2{
	
	void c();
}///////////////////////
abstract class AbsClass{//추상클래스
	
	void info() {
		System.out.println("AbsClass");
	}
	abstract void d();
	
}/////////////////
//MyDemo가 AbsClass, Inter3을 상속받은 뒤 컴파일 에러 없도록 조치하세요
public class MyDemo extends AbsClass implements Inter3{

	void d() {
		System.out.println("d()");
	}
	public void a() {
		System.out.println("a()");
	}
	public int b() {
		System.out.println("b()");
		return 100;
	}
	public void c() {
		System.out.println("c()");
	}
	
	
}//////////////////////
