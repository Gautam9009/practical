package march_10_23;

public class Class_Name_Array {
	public static void main(String args[]) {
		// declaration & initialization of an array
		double arr[]= {1,2,3};
		//getting the class name
		Class a=arr.getClass();
		String name =a.getName();
		// print the class name
		System.out.println(a);
	}
}
