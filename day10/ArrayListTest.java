package day10;
import java.util.*;
/*컬렉션: 
 * List, Set, Map,
 * - ArrayList
 *   - java.util.List계열
 *   - 입력순서를 기억한다
 *   - 데이터 중복을 허용한다.
 *   - 동적으로 저장크기를 늘릴 수 있다.
 *   - 참조형의 데이터를 저장함.
 *   - 다른 유형의 데이터도 저장 가능함
 * 
 * */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add("홍길동");
		lst.add("이순신");
		lst.add(100);//100정수==>auto boxing ==>Integer객체로 저장됨 
		lst.add(Integer.valueOf(200));
		lst.add(3.14);//Double객체로 저장
		lst.add('남');//Character객체
		lst.add(true);//Boolean객체
		
		Object obj=lst.get(0);
		System.out.println(obj);
		char ch=((String)obj).charAt(0);
		System.out.println(ch);
		
		
		Character c=(Character)lst.get(5);
		System.out.println(c);
		
		//5.0 이후부터 Generic을 이용
//		ArrayList<자료형> 변수 =new ArrayList<자료형>();
		
		ArrayList<String> lst2=new ArrayList<>();//String유형만 저장하는 ArrayList
		lst2.add("홍길동");
		lst2.add("최영");
		lst2.add("이순신");
		//lst2.add(100);[x]
		lst2.add("홍길동");
		
		System.out.println("lst2.size() : "+lst2.size());//저장한 데이터수
		
		String name=lst2.get(0);
		System.out.println(name);
		//for루프 이용해서 lst2에 저장한 사람들 모두 출력하기
		
		for(int i=0; i<lst2.size();i++) {
			String str=lst2.get(i);
			System.out.println(str);
			
		}
		//인덱스가 2인 곳의 데이터를 삭제하세요
		lst2.remove(2);
		System.out.println("---삭제후-----------");
		//for each loop문은 Generic을 사용할 경우에 쓸 수 있다.
		for(String str:lst2) {
			System.out.println(str);
		}
		
		lst2.add(2,"김철수");
		System.out.println("---중간 삽입후-------");
		for(String str:lst2) {
			System.out.println(str);
		}
		
		lst2.clear();//모두 삭제
		
		System.out.println("---모두 삭제후-------");
		for(String str:lst2) {
			System.out.println(str);
		}
		System.out.println("lst2.isEmpty(): "+lst2.isEmpty());
	}

}