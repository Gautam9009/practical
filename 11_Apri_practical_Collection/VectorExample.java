package april_12_23_Collection;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0,"Tiger");
		// checking size and capacity
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		// add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("After adding elements: ");
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		// checking cat is present in the vector or not
		System.out.println(vc);
		if (vc.contains("Cat")) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}  // getting first element
		System.out.println("1st element: "+vc.firstElement());
		// getting last elements
		System.out.println("last element: "+vc.lastElement());
		// checking index of specified element
		System.out.println("index: "+vc.indexOf("Cat"));
	}
}
