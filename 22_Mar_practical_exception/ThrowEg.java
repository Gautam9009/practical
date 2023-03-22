package march_22_23_exception;

public class ThrowEg {
	
	public static void mydisplay(int a) throws ArithmeticException{
		if(a>=0 && a<35) {
			// throw Arithmetic exception if not then fail
			throw new ArithmeticException("you are fail!!");
		}
		else {
			System.out.println("you are pass!!");
		}
	}
	public static void main(String[] args) {  // main method
		mydisplay(20);  // calling the function
		System.out.println("rest of the code...");
	}
}
