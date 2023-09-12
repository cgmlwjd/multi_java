package day10;
import java.util.*;
public class PongSite {
	public void join(String name, String userId, String pwd) throws NotSupportedNameException {
		System.out.println(">>>회원가입<<<");
		char ch = name.charAt(0);
		
		if(ch == '퐁') {
			System.out.println(name + "님 회원가입을 환영합니다.");
		} else if(ch == '콩') {
			throw new NotSupportedNameException("콩씨는 절대로 회원가입  불가");
		} else {
			throw new NotSupportedNameException("퐁씨 성이 아닌 분들은 이용에 제한이 있습니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("아이디: ");
		String userId = sc.nextLine();
		
		System.out.println("비밀번호: ");
		String pwd = sc.nextLine();
		
		//join() 호출
		PongSite ps = new PongSite();
		try {
			ps.join(name, userId, pwd);
		} catch(NotSupportedNameException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
