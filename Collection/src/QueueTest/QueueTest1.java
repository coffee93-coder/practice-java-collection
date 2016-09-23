package QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("�Ѹ�");
		q.offer("������");
		q.offer("��ġ");
		
		while(q.isEmpty()==false){
			String s = q.poll();
			System.out.println(s);
		}
		
		q.offer("��浿");
		q.add("�����");
		q.offer("�����");
		
		System.out.println(q.poll());
		System.out.println(q.peek()); //�鿩�� ���⸸ �ϴ°�.
		System.out.println(q.poll());
		//Queue�� �������̽��̰�, Stack�� Ŭ�����̰�!!!!
	}
}
