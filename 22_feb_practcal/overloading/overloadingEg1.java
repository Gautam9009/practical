package overloading;
// changing no of argument method 1
public class overloadingEg1 {
	static int sum(int a, int b) {  // two parameter argument
		return a+b;
	}
	static int sum (int x, int y, int z) {  // three parameter argument
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(overloadingEg1.sum(10, 5));
		System.out.println(overloadingEg1.sum(5,6,7));
	}

}
