package day05;

public class ArrayTest5 {
	public static void main(String[] args) {
		int a[][];
		a=new int[3][2];
		System.out.println(a[0][0]);
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60;
		
		System.out.println("행의 크기(a.length): " + a.length);
		System.out.println("열의 크기(a[i].length): " + a[0]. length);
		
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<a[i].length; k++) {
				System.out.print(a[i][k]+ ", ");
			}
			System.out.println();
			
		}
		System.out.println("**********************");
		for(int [] b:a) {
			for(int x:b) {
				System.out.print(x+ ", ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		short[]s[] = {{-5, -7, -9}, {10, 11}, {0}};
		System.out.println("s.length: " + s.length);
		System.out.println("s[0].length: " + s[0].length);
		System.out.println("s[1].length: " + s[1].length);
		System.out.println("s[2].length: " + s[2].length);
		
		for(short[] y:s) {
			for(short z:y) {
				System.out.print(z + ", ");
			}
			System.out.println();
			char [][]ch = new char[3][];
			System.out.println("행의 크기: " + ch.length);
			
			ch[0] = new char[2];
			ch[1] = new char[4];
			ch[2] = new char[3];
			System.out.println("ch[0].length: " + ch[0].length);
			System.out.println("ch[1].length: " + ch[1].length);
			System.out.println("ch[2].length: " + ch[2].length);
			
			ch[0][0] = 'H';
			ch[0][1] = 'i';
			ch[1][0] = 'J';
			ch[1][1] = 'a';
			ch[1][2] = 'v';
			ch[1][3] = 'a';
			
			for(char[]c:ch) {
				for(char v:c) {
					System.out.print(v);
				}
				System.out.println();
			}
			System.out.println("--------------------");
			
			System.out.println("---------------");
		}
		
	}
	

}
