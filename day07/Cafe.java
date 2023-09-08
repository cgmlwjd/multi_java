package day07;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.setCoffee(1);
		cm.setSugar(2);
		cm.setCream((short)3);
		
		//System.out.println("커피: " + cm.coffee);
		System.out.println("커피: " + cm.getCoffee());
		System.out.println("설탕: " + cm.getSugar());
		System.out.println("크림: " + cm.getCream());

	}

}
