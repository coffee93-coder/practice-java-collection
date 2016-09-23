package HashMapTest;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();

		map.put("one", new Integer(1));
		map.put("two", 2);
		map.put("three", 3);

		Integer i = map.get("two");
		System.out.println(i);
		
		//���� �ϸ� null �� ����Ʈ
		
		
		map.remove("two"); 
		System.out.println(map.get("two"));
		
		//�ߺ� �׽�Ʈ
		
		map.put("one", 10);
		System.out.println(map.get("one"));

	}
}
