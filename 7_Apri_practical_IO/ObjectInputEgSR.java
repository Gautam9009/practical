package april_7_23_IO;

import java.io.*;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String sname;
	int Fees;
	public Student(int id,String sname,int fees) {
		this.id = id;
		this.sname = sname;
		this.Fees = fees;
	}	
}
public class ObjectInputEgSR {
	public static void main(String[] args) {
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:\\sample.txt"));
			Student s = (Student) oi.readObject();
			System.out.println("id is : "+ s.id +","+" name is : "+s.sname+","+" fees is : "+s.Fees);
			oi.close();
		}
		catch (Exception e ) {
			System.out.println(e);
		}
	}
}
