package march_13_23;
import java.util.Scanner;
class StringTest {
String str ="Hello"; // str is a obj of string (by using literal)
public void show() {//method
	Scanner s = new Scanner (System.in); //User input
	System.out.println("Enter String");//Line no 1
	String A = s.next(); //1st String
	String B = s.next(); //2nd String
	System.out.println(A.length() + B.length());
	System.out.println((A.compareTo(B)>0) ? "Yes" :  "No"); //compare to()"
    System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "
	+B.substring(0,3).toLowerCase()+B.substring(1));	
	//Substring(),Upper case,lower case,java
	System.out.println("Substringis :"+str.substring(0,3));
	System.out.println("Substringis :"+str.substring(2));
	}
public static void main(String[] args) {
	StringTest t = new StringTest ();
	t.show();
	}
}