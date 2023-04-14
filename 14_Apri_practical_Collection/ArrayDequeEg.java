package april_14_23_collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		// dq.add(null); // null are not allowed
		System.out.println(dq);
		dq.addFirst("Shree");
		dq.addLast("Riya");
		System.out.println("New List");
		for(String s1 : dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("New List After Remocal");
		for(String s2 : dq) {
			System.out.println(s2);
		}		
	}
}
