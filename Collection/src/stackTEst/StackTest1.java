package stackTEst;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("�Ѹ�");
		stack.push("�����");
		stack.push("��浿");
		stack.push("������");
		
		while(stack.empty() == false){
			String s = stack.pop();
			System.out.println(s);
		}
		//stack.pop(); -> StackEmptyException �߻�.
		
		stack.push("����");
		stack.push("�����");
		stack.push("��ġ");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
