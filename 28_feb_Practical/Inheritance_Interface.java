package feb_28;

interface Parent{
	void show();
}
interface child extends Parent{
	void display();
}
class child1 implements child{
	@Override
	public void show() {
		System.out.println("Parent interface method");
	}
	@Override
	public void display() {
		System.out.println("Child interface method");
	}
}
public interface Inheritance_Interface {
	public static void main(String[] args) {
		child1 object = new child1();
		object.display();
		object.show();
	}

}
