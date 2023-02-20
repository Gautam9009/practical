package inheritance;

class Shape2 {  // parent class
	// constructor of parent class
	Shape2(){
		System.out.println("hello");
	}
}
class Size2 extends Shape2{  // child class 
	// constructor of the child class
	Size2(){	
		//invoke immediate parents class constructor line no 7
		super();
		System.out.println("hi");
	}
}
public class Supercons {
	public static void main(String[] args) {
		Size2 obj = new Size2();  // creating obj of child class
		// Shape2 obj = new Shape2();
	}

}
