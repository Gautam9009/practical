package array;
// example of single dimensional array

public class arrayEg {
	public static void main(String args[]) {
		String [] names = {"Mamta","Ram","Rohit","Kunal","Mohit","Sourav","Gautam"};  // Declaration & instantiation
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		int [] phone = {123,456,789,012,345,678,901,234,567,890};
		for (int j = 0;j<phone.length;j++) {
			System.out.println(phone[j]);
		}
	}

}
