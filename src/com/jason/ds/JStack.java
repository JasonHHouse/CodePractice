package com.jason.ds;

public class JStack {

	private Integer[] stack;

	public JStack() {
		stack = new Integer[5];
		clearStack(stack);
	}

	public Integer pop() {
		Integer output = stack[0];

		for (int i = 1; i < stack.length; i++)
			stack[i-1] = stack[i];
		if (stack.length == size())
			stack[size() - 1] = null;

		return output;
	}

	public int size() {
		for (int count = 0; count < stack.length; count++)
			if (stack[count] == null)
				return count;
		return stack.length;
	}

	public void push(Integer value) {
		if(value == null) {
			System.err.println("push Integer value cannot be null");
			return;
		}
		if (stack[stack.length - 1] != null) {
			Integer[] tempStack = new Integer[stack.length * 2];
			clearStack(tempStack);
			for (int i = 0; i < stack.length; i++)
				tempStack[i] = stack[i];
			stack = tempStack;
		}

		for (int i = stack.length - 2; i >= 0; i--)
			stack[i + 1] = stack[i];
		stack[0] = value;
	}

	private void clearStack(Integer[] stack) {
		for (int i = 0; i < stack.length; i++)
			stack[i] = null;
	}
	
	public void printStack() {
		String output = "";
		for (Integer i : stack)
			if (i != null)
				output += i + ", ";
		System.out.println(output);
	}
}
