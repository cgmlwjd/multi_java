package day05;

public class ArrayTest3 {
	public static void main(String[] args) {
		//ppt55
		String str[] = {"한국", "태국", "베트남", "미국", "일본"};
		char c[] = {'p', 'b', 'w', 'r', 'g'};
		float db[] = {163.7f, 187f, 158f, 160f, 167f};
		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
//		
//		for(int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
//		
//		for(int i = 0; i < db.length; i++) {
//			System.out.println(db[i]);
//		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] +"\t" + c[i] + "\t" + db[i] );
		}
	}

}
