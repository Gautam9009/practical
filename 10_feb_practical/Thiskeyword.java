package methods;

public class Thiskeyword {  // class 1 outer class
	// Instance variable
int Id;
String Ename;
double Salary;
// parameterized constructor
Thiskeyword( int Id, String Ename, double Salary ){
	this.Id = Id;
	this.Ename = Ename;
	this.Salary = Salary;
}    // method
	void display() {
		System.out.println(Id+" "+Ename+" "+Salary);
}
	public class Thiskeyword1{  // main class
		public static void main(String[] args) {
		// object
		Thiskeyword s1 = new Thiskeyword(101,"GAUTAM",12000);
		Thiskeyword s2 = new Thiskeyword(102,"MANISH",13000);
		Thiskeyword s3 = new Thiskeyword(103,"PAVNESH",14000);
		s1.display();
		s2.display();
		s3.display();
	}
}
}