package feb_28;

interface ParentInterface {
	void show();
}
class InterfaceEg1 implements ParentInterface {
	@Override
	public void show() {
		System.out.println("parent IInterface method");
	}
	public static void main(String[] args) {
		InterfaceEg1 object = new InterfaceEg1();
		object.show();
	}

}
