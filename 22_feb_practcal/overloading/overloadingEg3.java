package overloading;
// overloading type promotion
public class overloadingEg3 {  // class
void add (int a, double b) {  // method 1
	System.out.println(a+b);
}
void add (int a,int b, int c) {  //method2
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	overloadingEg3 obj = new overloadingEg3();  // object
	obj.add(2, 5);
	obj.add(5, 6, 9);
}
}
