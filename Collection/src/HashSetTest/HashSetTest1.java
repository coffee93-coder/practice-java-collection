package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
	public static  void main(String[] args) {
		// ������ ����. ������ ������ ���ϰ� key�� value�� mapping �Ѱ��� �ƴϴ�.
		// add �Ҽ� �ְ�, Ư���� ��ü�� ������ ���ϰ�, ��ü�� �������°͸��� �����ϴ�.
		// add(), contain()
		Set<String> set = new HashSet<String>();
		
		set.add("�Ѹ�");
		set.add("������");
		set.add("��浿");
		
		System.out.println(set.contains("�Ѹ�"));
		System.out.println(set.size());
		
		//�ߺ� ������ �������� �ʽ��ϴ�.
		set.add("�Ѹ�");
		System.out.println(set.size());
		
		//��ȸ
		Iterator< String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		

	}
}
