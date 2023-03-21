package march_21_23_exception;

class Multicatch {
	static void myFunc() {
		try {
			int i = 50/0;  // arithmetic 50/2
			System.out.println(i);  // Arithmetic
			int arr[] = new int[3]; // Array index out of bound
			arr[7] = 24;
		}
		catch(ArithmeticException e) {
			System.out.println("only 1st Airtmetic exception will execute");
		}
		catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("Now Array Index out of bound will occure");
	}
	finally {
		System.out.println("i am finally block");
	}

}
	public static void main(String[] args) {
		myFunc();
	}
}