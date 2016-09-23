package stackTEst;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("도우너");
		stack.push("고길동");
		stack.push("마이콜");
		
		while(stack.empty() == false){
			String s = stack.pop();
			System.out.println(s);
		}
		//stack.pop(); -> StackEmptyException 발생.
		
		stack.push("희동이");
		stack.push("도우너");
		stack.push("또치");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
