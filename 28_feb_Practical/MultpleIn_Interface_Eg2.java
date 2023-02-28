package feb_28;

interface New_Employee{
	void salary();
}
interface New_Developer{
	void salary();
}
class New_Trainer implements New_Employee, New_Developer {
	@Override
	public void salary() {
		System.out.println("Salary Increment");
	}
}
public interface MultpleIn_Interface_Eg2 {
	public static void main(String[] args) {
		New_Trainer object = new New_Trainer();
		object.salary();
	}

}
