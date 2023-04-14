package april_14_23_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEg {
	public static void main(String[] args) {
		// creating HashSet and adding elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("two");
		lhs.add("one");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		System.out.println("original list "+lhs);
		// REMOVING ELEMENTS FROM THE above mentioned list
		System.out.println(lhs.remove("two"));
		System.out.println("upload list: "+lhs);
		// six is not return
		// return false
		System.out.println(lhs.remove("six"));
	}
}
