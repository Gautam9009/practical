package april_5_23_IO;

import java.io.FileOutputStream;
// write String to byte array   write byte with file output stream
public class WriteByteFOS {
	public static void main(String[] args) {
		try {  // DESTINATION
			FileOutputStream f = new FileOutputStream("D:\\abcd.txt");
			String s ="Welcome to Anudip Foundation";
			byte b[] = s.getBytes();  // Converting string into byte array
					f.write(b);
					f.close();
					System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
