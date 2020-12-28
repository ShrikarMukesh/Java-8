package collect;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);stack.push(31);stack.push(16);stack.push(21);stack.push(13);
		System.out.println(stack);
		int minvalue = Integer.MAX_VALUE;
		while(!stack.isEmpty()) {
			int peekEle = stack.peek();
			if(minvalue > peekEle ) {
				minvalue = peekEle;
			}
			stack.pop();
		}
		System.out.println(minvalue);
	}
}
