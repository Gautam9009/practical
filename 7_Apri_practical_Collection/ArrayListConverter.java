package april_7_23_COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConverter {
	public static void main(String[] args) {
		// ArrayList all = new new ArrayList(); // generic
		// creating a ArrayList --- generic
		List<String> a1 = new ArrayList<String>();
		
		a1.add("Rose");
		a1.add("SunFlower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("MarGold");
		a1.add("Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add("Lavender");		
		// list to array
		System.out.println("List to Array");
		// to array() method used to convert list to array
		String[] arr = a1.toArray(new String[a1.size()]);
		for(String s : arr) {  // traversing using for each
			System.out.println(s);
		}
		// array to list
		System.out.println("Array To List");
		List<String> all = new ArrayList<String>();
		all = Arrays.asList(arr);  // asList method convert array to list
		System.out.println(all);		
	}
}
