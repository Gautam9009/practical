package march_14_23_String;

public class Stringbuff {
	public static void my() {
		// string buffer
		StringBuffer s= new StringBuffer("This is StringBuffer"); // object of string buffer class
		s.append("This is simple program");
		System.out.println("String is : " +  s); // hello world
		s.insert(21, "object");
		System.out.println("insert is:"+s);
		s.reverse();
		System.out.println("reverse is:"+s);
		s.replace(12, 17, "Builder");
		System.out.println("replace is:"+ s);
		}
	public static void main(String[] args) {
		my();
		}
	}
