package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("�Ѹ�");
		list.add("������");
		list.add("�����");
		
		//��ȸ1
		int size = list.size();
		for(int i = 0; i< size ; i++){
			String s  = list.get(i);
			System.out.println(s);
		}
		

		//��ȸ2	
		 Iterator<String> it = list.iterator();
		while(it.hasNext()){
			 String s = it.next();
			 System.out.println(s);
		 }

		System.out.println("==============================");
		
		for(String s: list){
			System.out.println(s);
		}
		
	}
}
