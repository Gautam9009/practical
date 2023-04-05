package april_6_23_IO;

import java.io.FileReader;


public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\FW.txt");
			int i = 0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
