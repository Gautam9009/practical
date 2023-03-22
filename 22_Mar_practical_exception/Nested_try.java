package march_22_23_exception;

public class Nested_try {
	public static void main(String[] args) {
		// outer try block
		try {  // 1st inner try block
			try {
				int a = 10/0;
				System.out.println(a);  // Arithmatic exception
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try { // 2nd inner block
				int arr[] =new int[3];
				int a = 5;
				arr[2]=22;
				System.out.println(a);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("both inner try done");
		}  // outer catch
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
	}

}
