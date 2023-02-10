package methods;

public class StaticMethod {
	int rollno;
	String name;
	float fee;
	static String college = "CRRIT"; // static variable
	// static method to change the value of static variable
	static void change() {  //Static method
	 college = "NIET";
	}
	// Parameterized constructor	
	StaticMethod( int rollno, String name, float fee){  // parameterized constructor
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	// user defined method
		void display(){
			System.out.println(rollno +" "+ name +" "+ fee +" "+ college);
		}
		public class StaticMethod1{   // class2
			public static void main(String[] args) {
				// calling static method with class name
				StaticMethod.change();
				// staticvariable1.change
				// objects
				StaticMethod s1 = new StaticMethod(111,"GAUTAM",4000);
				StaticMethod s2 = new StaticMethod(112,"SOURAV",6000);
				StaticMethod s3 = new StaticMethod(113,"MANISH",7000);
				s1.display();  //method call
				s2.display();
				s3.display();
			}
		}
}
