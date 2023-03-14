package march_14_23_String;
// represent any object to string
public class Tostring_Eg {
	int rollno;  // integer type variable
	String name,addr;  // String
	Tostring_Eg(int rollno,String name,String addr){
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
	public String toString() {
		return rollno+" "+name+" "+addr;
	}
	public static void main(String[] args) {
		Tostring_Eg s1 = new Tostring_Eg(1,"ram","Mumbai");  //return the hashcode value of an object
		Tostring_Eg s2 = new Tostring_Eg(2,"Karan","Delhi");
		
		System.out.println(s1);  // compiler write s1.toString
		System.out.println(s2);
	}

}
