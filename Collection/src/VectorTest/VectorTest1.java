package VectorTest;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.addElement("둘리");
		v.addElement("마이클");
		v.addElement("도우넛");
		
		//순회1
		for (int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		//순회2 v.elements(); //iterator 같은 걸로 순회하는 
		Enumeration<String> enumeration = v.elements();
		while(enumeration.hasMoreElements()){
			String s = enumeration.nextElement();
			System.out.println(s);
		}
	
	}
}
