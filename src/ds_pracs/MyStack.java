package ds_pracs;

public class MyStack {
	/*
	 * Stack is based on LIFO (Last In first Out..)
	 * Stack works with 2 data structures internally i.e. Arrays & Linked List.
	 * 
	 * operations on Stack:
	 * 1.Push ()
	 * 2.Pop (gives the last input element)
	 * 
	 */ 
	private Object[] stackArr;
	private int size;
	private int top;
	
	public MyStack() {
		size=10;
		top = -1;
		stackArr=new Object[size];
	}
	
	public MyStack(int size) {
		top = 0;
		this.size=size;
		stackArr=new Object[this.size];
	}

	public boolean isFull() {
		return (top == (stackArr.length-1));
	}
	
	public boolean push(Object item) {
		if(!isFull()) {
			top++;
			stackArr[top] = item;
			return true;
		}else {
			return false;
		}
		
	}	
	
	public Object pop() {
		return stackArr[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}
