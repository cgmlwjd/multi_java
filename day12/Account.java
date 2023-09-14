package day12;

public class Account {
	
	private int money = 10;
	private boolean flag = false;
	
	public void save(int val) {
		synchronized(this){
			money += val;
			System.out.printf("입금액: %d, 입금 후 잔액: %d%n", val, money);
			flag = true;
			notify();
		}
		
	}
	
	synchronized public void get(int val) {
		if(!flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
			
		}
		
		if(money - val < 0) {
			System.out.printf("현금 부족!! 현재 잔액: %d, 요청금액: %d%n", money, val);
			return;
		}
		money -= val;
		System.out.printf("출금액: %d, 출금후잔액: %d%n", val, money);
	}
}
