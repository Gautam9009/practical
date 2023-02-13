package inheritance;
 public class MultiLevelInheritanceEg2 {
	int salary = 40000;
 }
	class MIChildEg1 extends MultiLevelInheritanceEg2 {
		int bonous = 4000;
		int annualsalary = salary+bonous;   // as = Annual Salary
	}

class MIChildEg2 extends MIChildEg1{
	int da = 400;   //da = Dinner allowance
	int totalsalary = annualsalary+da;

	public static void main(String[] args) {
		MIChildEg2 object = new MIChildEg2();
		System.out.println("Salary is: "+ object.salary);
		System.out.println("Annual Salary is: "+ object.annualsalary);
		System.out.println("Total Salary is: "+ object.totalsalary);
	}
}
 
