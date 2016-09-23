package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
	public static  void main(String[] args) {
		// 순서가 없다. 순서로 빼내지 못하고 key와 value가 mapping 한것이 아니다.
		// add 할수 있고, 특정된 객체를 빼내지 못하고, 전체를 가져오는것만이 가능하다.
		// add(), contain()
		Set<String> set = new HashSet<String>();
		
		set.add("둘리");
		set.add("마이콜");
		set.add("고길동");
		
		System.out.println(set.contains("둘리"));
		System.out.println(set.size());
		
		//중복 데이터 저장하지 않습니다.
		set.add("둘리");
		System.out.println(set.size());
		
		//순회
		Iterator< String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		

	}
}
