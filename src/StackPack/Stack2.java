package StackPack;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack R = new Stack();
		
		R.push("Traffic");
		R.push(true);
		R.push("Police");
		R.push("Java");
		R.push(452);
		R.push("Hello");
		R.push(true);
		R.push("Scrolling");
		R.push("Yes");
		
		System.out.println(R);
		
		
		R.pop();
		
		System.out.println(R);
		
		System.out.println(R.firstElement());
		System.out.println(R.lastElement());
		System.out.println(R.peek());

	}

}
