
public class MainActivity {
	
	public static void main(String[] args) {
		Stack<Integer> main_stack = new Stack<Integer>(11);
		
		main_stack.push(1);
		main_stack.push(2);
		main_stack.push(3);
		main_stack.push(4);
		main_stack.push(5);
		main_stack.push(6);
		main_stack.push(7);
		main_stack.push(8);
		main_stack.push(9);
		main_stack.push(10);
		
		System.out.println("Top Element is: " + main_stack.peek());
		
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		System.out.println(main_stack.pop());
		
		
		System.out.println("Top Element is: " + main_stack.peek());
		
		main_stack.print();
		
		main_stack.search(2);
	}
}
