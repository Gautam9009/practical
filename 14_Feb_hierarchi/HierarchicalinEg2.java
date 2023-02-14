package inheritance;
class Employee{
	int salary = 15000;
	int bonous = 2000;
	void action() {
		int us = salary+bonous;
		System.out.println(us);
	}
}
class Engineer extends Employee {
	int Benefits = 200;
}
class Doctor extends Employee{
	int Benefits = 100;
}
public class HierarchicalinEg2 {
	public static void main(String[] args) {
		Engineer e = new Engineer();
		System.out.println(e.salary+" + "+e.Benefits+" "+"increment salary for Engineer");
		e.action();
		Doctor d = new Doctor();
		System.out.println(d.salary+" + "+d.Benefits +" "+"increment salary for Doctor");
		d.action();
	}
	

}
