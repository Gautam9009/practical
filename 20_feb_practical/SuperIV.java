package inheritance;

class Shape{
String name = "circle";
}
class Size extends Shape{
	String name="no size";
	void print(){
		//System.out.println(name);
		System.out.println(super.name);
	}
}
class SuperIV{
	public static void main(String[] args) {
		Size obj = new Size();
		obj.print();
	}
}
 