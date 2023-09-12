package day10;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		// Person객체 3개 생성하기
		Person p1 = new Person("이영희", 22);
		Person p2 = new Person("원빈", 25);
		Person p3 = new Person("김진아", 26);
		
		// HashSet객체 생성해서 Person 3개 저장하세요
		HashSet<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println("set.size(): " + set.size());
		//iterator()메서드를 이용해서 HashSet에 저장된 사람들의 이름과 나이를 출력하세요
		Iterator<Person> it = set.iterator();
		for(;it.hasNext();) {
			Person p = it.next();
			System.out.println(p.getName() + ": " + p.getAge() + "세");
		}
		System.out.println("--------------------");
		Person p4 = new Person("이영희", 22);
		set.add(p4);
		
		System.out.println("set.size(): " + set.size());
		
		for(Person p : set) {
			System.out.println(p.getName() + "#" + p.getAge());
		}
	
	}

}
