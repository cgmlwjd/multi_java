package yourpack;

import mypack.Parent;

public class Son2 extends Parent {
	public void go() {
		System.out.println("publicVar: " + publicVar);
		System.out.println("protectedVar: " + protectedVar);
		//System.out.println("defaultVar: " + defaultVar); //[x] 같은 패키지에 있어야 한다.
		//System.out.println("privateVar: " + privateVar);
	}
	
	public static void main(String[] args) {
		new Son2().go();
	}

}
