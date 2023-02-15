package inheritance;

class Student2{
	String name;
	int id;
	int phone;
	Address address;
	public Student2(String name, int id, int phone, Address address) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	void show() {
		System.out.println(name+" "+id+" "+phone);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}	
}
public class Aggregation {
	public static void main(String[] args) {
		Address address1 = new Address("Faridabad","Haryana","India");
		Address address2 = new Address("Delhi","New Delhi","India");
		
		Student2 s = new Student2("Gautam",101,12345,address1);
		Student2 s1 = new Student2("Manish",202,67890,address2);
		
		s.show();
		s1.show();
	}

}
