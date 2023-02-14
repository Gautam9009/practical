package inheritance;

 class MIChildEg2 {
	int salary = 40000;
 }
	class MIChildEg1 extends MIChildEg2 {
		int bonous = 4000;
		int annualsalary = salary+bonous;   // as = Annual Salary
	}

class MultiLevelInheritanceEg2 extends MIChildEg1{
	int da = 400;   //da = Dinner allowance  
	int totalsalary = annualsalary+da;

	public static void main(String[] args) {
		MultiLevelInheritanceEg2 object = new MultiLevelInheritanceEg2();
		System.out.println("Salary is: "+ object.salary);
		System.out.println("Annual Salary is: "+ object.annualsalary);
		System.out.println("Total Salary is: "+ object.totalsalary);
	}
}
 
