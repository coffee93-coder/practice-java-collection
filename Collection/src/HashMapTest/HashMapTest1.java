package HashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("one", new Integer(1));
		map.put("two", 2);
		map.put("three", 3);
		
		Integer i = map.get("two");
		System.out.println(i);
		
		map.remove("two");
		System.out.println(map.get("two"));
		
		//��ȸ
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()){
			String key = it.next(); 		// Ű���� �޾ƿͼ� 
			Integer v = map.get(key);		// Ű������ ���� ���� �־�.
			System.out.println(v);
		}
		
	}
}
