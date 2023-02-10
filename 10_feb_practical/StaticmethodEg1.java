package methods;

public class StaticmethodEg1 {
static int mul(int a, int b) {
	return a*b;
}
public static void main(String[] args) {
	int c = StaticmethodEg1.mul(10, 5);
	System.out.println(c);
}
}
