package HashTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {
	public static void main(String[] args) {
		
		Set< Money> set = new HashSet<Money>();
		
		set.add(new Money(1));
		set.add(new Money(2));
		set.add(new Money(3));
		//중복 테스트
		set.add(new Money(2));  //중복이 되용 ㅠ^ㅠ  //객체 Money가 주소 기반이니까!
		//Money를 내용기반으로 변경하고하면...  중복이 되지 않는다잉... 대박이넹..
		
		
		Iterator<Money> it = set.iterator();
		while(it.hasNext()){
			Money m = it.next();
			System.out.println(m); // 순서가 다르게 나온다! ㅎㅎ 
		}
		
		
	}
}
