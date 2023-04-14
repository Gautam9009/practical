package april_14_23_collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		// creating and adding
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Pallabi");
		deque.add("Subhrajit");
		deque.add("Mamta");
		deque.add("Monami");
		deque.offerFirst("Anju");
		System.out.println(" After offer first");
		// traversing
		for(String str : deque) {
			System.out.println(str);
		}
		deque.offerLast("Monalisa");
		System.out.println("After offer Last");
		// traversing
		for(String str1 : deque) {
			System.out.println(str1);
		}  // deque.peek() & deque.peekFirst same as peek()
		System.out.println("peek: "+deque.peek());
		System.out.println("peek first: "+deque.peekFirst());
		System.out.println("peek last: "+deque.peekLast());
		System.out.println("After peek ");
		for(String str1: deque) {
			System.out.println(str1);
		}  //deque.poll() & deque.pollFirst same as poll()
		System.out.println("poll: "+deque.poll());
		System.out.println("poll First: "+deque.pollFirst());
		System.out.println("poll Last: "+deque.pollLast());
		System.out.println("After poll");
		for(String str2:deque) {
			System.out.println(str2);
		}
	}

}
