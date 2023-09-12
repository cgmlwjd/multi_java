package day10;
import java.util.*;

/*
 * Queue
 * - List계열
 * - 구현한 클래스 LinkedList, PriortyQueue
 * - FIFO 구조(First In First Ou)
 * */
public class QueueTest {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList();
		q.add("어제 먹은 우유");
		q.add("오늘 먹은 우유");
		q.add("내일 먹을 우유");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		String s = q.poll(); //첫번째 요소를 삭제하고 삭제한 요소를 반환
		System.out.println("s: " + s);
		
		System.out.println(q);
		/* 순차적으로 데이터를 저장: ArrayList를 사용하는 것이 좋고
		 * 중간에 삽입하거나 삭제해야 할 때는 LinkedList를 사용하는 것이 좋다
		 * */
		//q.iterator()
		
	}

}
