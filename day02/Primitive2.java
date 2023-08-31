package day02;

public class Primitive2 {
	public static void main(String[] args) {
		System.out.println("----실수형----");
		float ft1 = 10.123F;
		//float의 경우 부동소수점의 경우 반드시 접미사 f를 붙여준다. 그렇지 않으면 double로 인식함
		System.out.println("ft1= " +ft1);
		
		double db1 = -789.258;
		double db2 = 4545.0012;
		System.out.println("db1= "+db1);
		System.out.println("db2= "+db2);
		
		double db3=8e-5;
		double db4=8e+5;
		
		System.out.println("db3= " + db3);
		System.out.println("db4= "+ db4);
		
		float ft5=900;
		
		byte b1=10;
		byte b2=20;
		
		int b3 = b2 - b1;
		System.out.println("b3= "+b3);
		
		byte b4 = (byte)128;
		System.out.println("b4 = " +b4);
		
		short s=(short)128;
		System.out.println(s);
		
		System.out.println("----논리형----");
		boolean bool = true;
		boolean bool2 = 2>5;
		System.out.println("bool= " + bool);
		System.out.println("bool2 = " + bool2);
	}

}
