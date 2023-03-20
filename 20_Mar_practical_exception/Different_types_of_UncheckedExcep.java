package march_20_23_exception;

public class Different_types_of_UncheckedExcep {
	public void display() {  // method
		// before try - catch
		String a = " i am error";
		System.out.println(a);
		try {  // Arithmetic exception
			int i = 50/0;
			System.out.println(i);
			// null pointer Exception
			String s = null;
			System.out.println(s.length());
			// Array Index out of Sound Exception
			int arr[] = new int[5];
			arr[7] = 10;
			// number format Exception
			int n = Integer.parseInt(s);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// after try - catch block
		String b = "The End";
		System.out.println(b);		
	}
	public static void main(String[] args) {
		Different_types_of_UncheckedExcep due = new Different_types_of_UncheckedExcep();
		due.display();
	}
}
