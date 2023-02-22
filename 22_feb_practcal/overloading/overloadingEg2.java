package overloading;
// changing data type argument
public class overloadingEg2 {
	static int sum(int a, int b) {  // two parameter argument
		return a+b;
	}
	static double sum (double a, double b) {  // two parameter argument
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(overloadingEg1.sum(10, 5));
		System.out.println(overloadingEg1.sum(5,6));
	}
}

