package march_14_23_String;

public class MutableExamplestring {
	public static void my() {
		// string buffer
		StringBuffer s= new StringBuffer("Hello"); // object of string buffer class
		s.append("World");
		System.out.println("String is :"+ s); // hello world
		s.insert(2, "Riya"); // (int off set,string a)//
		System.out.println("insert is:" + s); //  heRiyallo World
		s.replace(1, 3, "Java");
		System.out.println("replace is :"+ s);// Hjavaiyalloworld
		System.out.println("capasity is:"+ s.capacity());
		// string Builder
		StringBuilder s1= new StringBuilder("world");//
		s1.replace(1, 3, "java");
		System.out.println("replace is:"+ s1);
		s1.delete(1, 3);
		System.out.println("delete is:"+ s1);
		s1.reverse();
		System.out.println("reverse is:"+ s1);
	}
	public static void main(String[] args) {
		my();
		}	
	}
