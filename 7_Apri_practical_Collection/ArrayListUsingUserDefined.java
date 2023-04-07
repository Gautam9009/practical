package april_7_23_COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingUserDefined {
	public static void main(String[] args) {
		
		Bank b = new Bank(12345, "Gautam", 5000.67, 20);
		Bank b1 = new Bank(144515, "Sourav", 5999.67, 20);
		Bank b2 = new Bank(11545, "Ram", 5055.57, 20);
		Bank b3= new Bank(12345, "Manish", 5550.67, 20);
		Bank b4 = new Bank(12455, "Kunal", 5084.68, 20);
		Bank b5 = new Bank(12895, "Shweta", 5047.35, 20);
		
		ArrayList<Bank> a1 = new ArrayList<Bank>();
		a1.add(b);
		a1.add(b2);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			Bank obj =(Bank) itr.next();
			System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);			
		}
	}
}
