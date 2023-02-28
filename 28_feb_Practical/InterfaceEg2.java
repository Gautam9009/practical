package feb_28;

interface Shape {
	void shape_name();
}
class User_Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a Circle");
	}
}
class User_Triangle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a Triangle");
	}
}
public interface InterfaceEg2 {
	public static void main(String[] args) {
		Shape object = new User_Triangle();
		object.shape_name();
	}
}
