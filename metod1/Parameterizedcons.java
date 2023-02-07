package methods;

public class Parameterizedcons {
int age;
String name;
// parameterized cons where we have to pass the parameter
Parameterizedcons(int a, String n) {
		age=a;
        name=n;
}
void show() {
	System.out.println(age+ " " +name);
}
public static void main(String[] args) {
	Parameterizedcons d=new Parameterizedcons(32, "gautam");
			Parameterizedcons d1=new Parameterizedcons(25, "gourav");
			Parameterizedcons d2=new Parameterizedcons(21, "sourav");
			Parameterizedcons d3=new Parameterizedcons(28, "manish");
			Parameterizedcons d4=new Parameterizedcons(35, "pavnesh");
			
			d.show();
			d1.show();
			d2.show();
			d3.show();
			d4.show();
}
}