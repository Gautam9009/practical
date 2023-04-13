package april_13_23_Collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEg {
	public static void main(String[] args) {
		// creating stack class
		Stack<Integer> s = new Stack<>();
		// checking empty or not
		boolean result = s.isEmpty();
		System.out.println("is the stack empty ?"+ result);
		// adding element(push)
		s.push(25);  //6
		s.push(20);  //5
		s.push(75);  //4
		s.push(56);  //3
		s.push(80);  //2
		s.push(43);  //1
		s.push(34);  //0
		s.add(4,78);
		
		System.out.println("Stack element: "+s);// result
		Integer digit =s.peek();  // access element from the top of thestack
		System.out.println("top element: "+digit);
		System.out.println("stack element after peek: "+s);
		Integer digit2 = s.pop();
		System.out.println("Top element: "+digit2);
		System.out.println("Stack element after pop: "+s);
		int digit1 = s.search(75);  // search any element
		System.out.println("search element: "+digit1);
		int x = s.size();  // find the size of the stack
		System.out.println("stack size:"+x);
		result = s.empty();  // checking empty or not
		System.out.println("is the stack empty ?"+result);
				
	}

}
