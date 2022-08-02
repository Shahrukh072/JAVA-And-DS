package stacks;

import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> helper) {
		
	}

	public static void main(String[] args) {
		int arr[] = {5,6,7,1,9};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
        
		for(int elem : arr) {
			stack.push(elem);
		}
		reverseStack(stack, helper );
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
