package day12;

public class UserIn extends Thread {
	
	private Account account;
	
	public UserIn(String name, Account ac) {
		this.setName(name);
		this.account = ac;
	}
	
	@Override
	public void run() {
		//1만원씩 저측
		for(int i = 0; i < 5; i++) {
			account.save(1);
		}
	}

}
