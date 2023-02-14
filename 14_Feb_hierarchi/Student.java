package inheritance;

public class Student {
String city, state, country;
public Student(String city, String state, String country) {
	this.city = city;
	this.state = state;
	this.country = country;
}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String[] args) {
	Student address1 = new Student("dgp","wb","india");
	Student address2 = new Student("fbd","hr","india");
	Student s = new Student(12,address1,"anudip");
	Student s1 = new Student(209,address2,"anudip");
	s.display();
	s1.display();
	
}
}
