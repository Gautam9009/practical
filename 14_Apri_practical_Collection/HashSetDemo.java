package april_14_23_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		// creating HashSet and adding elements
		HashSet<String> set = new HashSet(); // set 1
		set.add("ram");
		set.add("rima");
		set.add("Shyam");
		set.add("ram");
		set.add("ramesh");
		System.out.println("original list: "+set);
		// removing specific element from hash set
		set.remove("ram");
		System.out.println("After invoking remove: "+set);
		
		HashSet<String>set1 = new HashSet(); // set2
		set1.add("pallabi");
		set1.add("Rahul");
		System.out.println("New Set: "+set1);
		set.addAll(set1);
		System.out.println("update list: "+set);
		// remove all the new elements
		set.removeAll(set1);
		// remove all
		set.clear();
		System.out.println("present list: "+set);
	}
}
