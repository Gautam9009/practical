package inheritance;
class SIParentEg2{
	int salary = 20000;
}
public class SIChildEg2 extends SIParentEg2 {
	int bonous = 2000;
	int annualsal = salary + bonous;
	public static void main(String[] args) {
		SIChildEg2 object = new SIChildEg2();
		System.out.println("Salary is: "+ object.salary);
		System.out.println("Annual Salary is: "+ object.annualsal);
	}

}
