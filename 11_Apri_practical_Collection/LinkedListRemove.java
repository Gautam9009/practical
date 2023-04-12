package april_12_23_Collection;

import java.util.Iterator;
import java.util.LinkedList;
// remove method combination
public class LinkedListRemove {
	public static void main(String[] args) {
		// create list1
		LinkedList<String> ll = new LinkedList<String>();		
		ll.add("Mishab");
		ll.add("Abhishek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");	
		System.out.println("List 1 element: "+" "+ll);
		// create list 2
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Peso");
		ll2.add("Shifa");
		ll2.add("Elijah");
		System.out.println("List 2 element: "+" "+ll2);
		// adding new element to the list 1
		ll.addAll(ll2);
		System.out.println(" After adding new eklements: "+" "+ll);
		// Removing specific element from array list 1
		ll.remove("Nildari");
		System.out.println("After Removing: "+" "+ll);
		// Removing specific element on the basis of particular position
		ll.remove(1);
		System.out.println("After Removing from specific position: "+ll);
		// Remove all the new element of list 2
		ll.removeAll(ll2);
		System.out.println("After removing last element: "+" "+ll);
		// remove 1st elements from the list
		ll.removeFirst();
		System.out.println("After removing First elements: "+" "+ll);
		// remove last elements from the list
		ll.removeLast();
		System.out.println("After removing last elements: "+" "+ll);		
		// adding new elements to the list 1
		ll.add("pallabi");
		ll.add("Anudip");
		ll.add("Java");
		ll.add("Pallabi");
		ll.add("Collection");
		System.out.println("update list elements: "+" "+ll);
		// remove first occurrence of element
		ll.removeFirstOccurrence("pallabi");
		System.out.println("Remove 1st occurance: "+" "+ll);
		//remove last occurrence of element
		ll.removeLastOccurrence("pallabi");
		System.out.println("Removing last occurencr: "+" "+ll);
		// Traversing the list of elements in reverse order
		Iterator i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// remove all elements
		ll.clear();
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
