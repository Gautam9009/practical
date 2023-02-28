package feb_28;

interface Employee{
	void salary();
}
interface Developer{
	void Bonous();
}
class Trainer implements Employee,Developer {
	@Override
	public void Bonous() {
		System.out.println("bonous will be 10% of salary");
	}
	@Override
	public void salary() {
		System.out.println("Salary Incremented");
	}
}
public interface MultpleIn_Interface {
	public static void main(String[] args) {
		Trainer object = new Trainer();
		object.Bonous();
		object.salary();
	}

}
