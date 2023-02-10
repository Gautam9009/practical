package methods;

public class Staticvariable1 {   // class1
    // Instance variable
	int rollno;
	String name;
	float fee;
	static String college = "NIET"; // static variable
	// static void change() {
	// cOllege = "ITC"
	// constructor
	
	Staticvariable1( int rollno, String name, float fee){  // parameterized constructor
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
		void display(){
			System.out.println(rollno +" "+ name +" "+ fee +" "+ college);
		}
		public class Staticvariable{   // class2
			public static void main(String[] args) {
				// staticvariable1.change
				// objects
				Staticvariable1 s1 = new Staticvariable1(111,"GAUTAM",5000);
				Staticvariable1 s2 = new Staticvariable1(112,"SOURAV",6000);
				Staticvariable1 s3 = new Staticvariable1(113,"MANISH",7000);
				s1.display();  //method call
				s2.display();
				s3.display();
				
			}
		}
	}
	

