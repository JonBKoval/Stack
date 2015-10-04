// TODO 
/*
 * Simple implementation of a stack using an array and generics
 */


public class Stack<V> {
	private final int size;
	private int top;
	private V[] elements;

	public Stack() {
		this(10);
	}
	
	public Stack(int s) {
		if(s < 0) {
			s = 10;
		}
		size = s;
		top = -1;
		elements = (V[]) new Object[size];
	}
	
	public void push(V item) {
		if(top == size - 1) {
			// Stack is full
			System.out.println("Stack is full cannot push new item onto the stack.");
		}
		else {
			elements[++top] = item;
		}
	}
	
	public V pop() {
		if(top == -1) {
			// Stack is empty
			System.out.println("Stack is empty cannot pop");
			return null;
		}
		else {
			return elements[top--];
		}
	}
	
	public V peek() {
		if(top == -1) {
			// Stack is empty
			System.out.println("Stack is empty cannot peek");
			return null;
		}
		else {
			return elements[top];
		}
	}
	
	public void print() {
		System.out.printf("Contents of stack: ");
		for(int i = 0; i < (top + 1); i++) {
			if(i == (top)) {
				System.out.print(elements[i]);
			}
			else {
				System.out.printf(elements[i] + ", ");
			}
		}
	}

	public V search(V item) {
		System.out.println();
		for(int i = 0; i < (top + 1); i++) {
			if(item == elements[i]) {
				System.out.printf(item + " was found in the stack");
				return item;
			}
		}
		System.out.printf(item + " not found in stack.");
		return null;
	}
}
