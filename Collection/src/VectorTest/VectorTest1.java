package VectorTest;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.addElement("�Ѹ�");
		v.addElement("����Ŭ");
		v.addElement("�����");
		
		//��ȸ1
		for (int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		//��ȸ2 v.elements(); //iterator ���� �ɷ� ��ȸ�ϴ� 
		Enumeration<String> enumeration = v.elements();
		while(enumeration.hasMoreElements()){
			String s = enumeration.nextElement();
			System.out.println(s);
		}
	
	}
}
