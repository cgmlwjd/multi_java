package day08;

public class Cafe {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		
		//밀크커피
		cm.makeTea(2, 1, 3);
		
		//설탕커피
		cm.makeTea(2, 4);
		
		//블랙커피
		String s = cm.makeTea(1);
		System.out.println(s);
		
		//크림커피
		cm.makeTea(1, 2L);
		cm.makeTea(3L, 2);
		
		//유자차
		Yuja yj = new Yuja();
		yj.setYuja(5);
		yj.setSugar(5);
		String s2 = cm.makeTea(yj);
		System.out.println(s2);
		
		
	}
}
