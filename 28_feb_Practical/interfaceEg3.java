package feb_28;

interface ParentInterface1 {
	void show();
	default void print() {
		System.out.println("Default Method");
	}
	static void display() {
		System.out.println("Static Method");
	}
}
class interfaceEg3 implements ParentInterface1{
	@Override
	public void show() {
		System.out.println("Parent Interface Method");
	}
	public static void main(String[] args) {
		interfaceEg3 object = new interfaceEg3();
			object.show();
			object.print();
			ParentInterface1.display(); 
		}
	}

