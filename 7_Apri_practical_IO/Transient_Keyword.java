package april_7_23_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Test implements Serializable{
	transient int id;
	String name;
	public Test(int i, String n) {
		this.id = i;
		this.name = n;
	}	
}
public class Transient_Keyword {
	public static void main(String[] args) throws Exception{
		Test obj = new Test(1,"Gautam");
		
		// Serialization
		FileOutputStream f = new FileOutputStream("D:\\sample1.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(obj);
		o.flush();
		o.close();
		f.close();
		System.out.println("Done");
		
		//DeSerialization
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:\\sample1.txt"));
		Test obj1 = (Test)oi.readObject();
		System.out.println(obj1.id+" "+obj.name);
		oi.close();		
	}
}
