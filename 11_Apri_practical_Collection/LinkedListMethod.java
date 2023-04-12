package april_12_23_Collection;

import java.util.Iterator;
import java.util.LinkedList;
// other method combination
public class LinkedListMethod {
	public static void main(String[] args) {
		// create list1 
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Mishab");
		ll.add("Abhishek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");		
		System.out.println("List 1 elements: "+" "+ll);
		// retrieves the 1st elements of the list -- by default
		System.out.println(ll.peek());
		// retrieves the 1st elements of the list
		System.out.println(ll.peekFirst());
		// retrieves the last elements of the list
		System.out.println(ll.peekLast());
		// retrieves and removes the 1st elements of the list -- by default
		System.out.println(ll.poll());
		System.out.println("List 1 elements: "+" "+ll);
		// retrieves the 1st elements of the list
		System.out.println(ll.pollFirst());
		System.out.println("List 1 elements: "+" "+ll);
		// retrieves the last elements of the list
		System.out.println(ll.pollLast());
		System.out.println("List 1 elements: "+" "+ll);
		
		System.out.println(ll.pop());
		System.out.println("list 1 elementa: "+" "+ll);		
	}
}
