package ArrayList_LinkedListTest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		List<String> list1= new LinkedList<String>();
		List<String> list = new ArrayList<String>();
		
		list1.add("test");
		list1.add("asdw");
		
		list = list1;
		list.add("3");
		
		 Iterator<String> it = list.iterator();
		while(it.hasNext()){
			 String s = it.next();
			 System.out.println(s);
		 }
		System.out.println("================================");
		List<String> list2 = new Vector <String>();
		
		list2 = list;
		list2.add("4");
		
		 Iterator<String> it1 = list2.iterator();
		while(it.hasNext()){
			 String s = it1.next();
			 System.out.println(s);
		 }
		
		
	}
}
