package QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		while(q.isEmpty()==false){
			String s = q.poll();
			System.out.println(s);
		}
		
		q.offer("고길동");
		q.add("희둥이");
		q.offer("도우너");
		
		System.out.println(q.poll());
		System.out.println(q.peek()); //들여다 보기만 하는것.
		System.out.println(q.poll());
		//Queue는 인터페이스이고, Stack은 클래스이고!!!!
	}
}
