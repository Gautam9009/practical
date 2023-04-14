package april_14_23_collection;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Prorityqueueeg {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Prakash");
		queue.add("Babai");
		queue.add("Sankhajit");
		queue.add("Hasan");
		queue.add("Bumba");
		queue.add("Owashin");
		queue.add("Tanmoy");
		System.out.println("head "+queue.element());
		System.out.println("Queue: "+queue);
		System.out.println("head: "+queue.peek());
		System.out.println("Queue: "+queue);
		System.out.println("Iterating the element");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("head: "+queue.poll());
		System.out.println("Queue: "+queue);
		System.out.println("head: "+queue.remove());
		System.out.println("Queue: "+queue);
		System.out.println("after removing");
		Iterator<String> itr1 = queue.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
	}
}
