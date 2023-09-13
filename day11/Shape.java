package day11;

public abstract class Shape {
	private String info="나는 도형 클래스에요";
	
	public String getInfo() {
		return info;
	}
	
	abstract void area(int x, int y); //메서드 몸체 없이 선언한 것 => 추상메소드
}

class Rectangle extends Shape {
	public void area(int w, int h) {
		int a = w*h;
		System.out.println("사각형 면적: " + a);
	}
}

class Triangle extends Shape {
	public void area(int u, int h) {
		int b = u*h/2;
		System.out.println("삼각형 면적: " + b);
	}
}

abstract class Circle extends Shape {
	final double pi = 3.14;
	
}

class SubCircle extends Circle {
	@Override
	public void area(int r, int r2) {}
	
	public void area(int r) {
		double k = pi*r*r;
		System.out.println("원의 면적: " + k);
	}
}