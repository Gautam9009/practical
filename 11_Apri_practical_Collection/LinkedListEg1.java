package april_12_23_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg1 {
	public static void main(String[] args) {
			LinkedList<String>ll=new LinkedList<String>();//create list
			ll.add("Tushar");
			ll.add("Pallabi");
			ll.add("Riya");
			ll.add("Dev");
			ll.add("Mukul");
			System.out.println(ll);
			Iterator<String>itr=ll.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			// adding an elements at the specific position
			ll.add(2, "Sourav");// add(int index, element)
			System.err.println("After adding:"+" "+ll);
			LinkedList<String>ll2=new LinkedList<String>();
			ll2.add("kushar");
			ll2.add("Baby");
			ll2.add("Tiya");
			System.out.println("list 2 elemnts:"+" "+ll2);
			// adding all 2nd elements to the 1st list
			ll.addAll(ll2);
			System.err.println("After adding all elements of list 2:"+" "+ll);
			// adding all 2nd list elements to the 1st list at a specific position
			ll.addAll(2,ll2);
			System.err.println("After adding all elements of list 2 at specific position:"+" "+ll);
			//adding elements at the 1st position 
			ll2.addFirst("Sushma");
			System.out.println("Add elements of list 1st:"+" "+ll2);
			//adding elements at the 1st position 
					ll2.addLast("Arvind");
					System.out.println("Add elements at last:"+" "+ll2);						
		}
}
