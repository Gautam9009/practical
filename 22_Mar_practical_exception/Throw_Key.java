package march_22_23_exception;
// weather is a student is eligible for java course or not
public class Throw_Key {
	public static void check(int marks) {
		if(marks<60) {
			// throw instance = throw keyword new and then exception
			throw new ArithmeticException("Student is not eligible for course");			
		}
		else {
			System.out.println("Student is eligible for course");
		}
	}
	public static void main(String[] args) {
		check(62);
	}
}
