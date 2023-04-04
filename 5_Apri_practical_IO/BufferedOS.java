package april_5_23_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOS {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\abcd.txt");
			BufferedOutputStream b = new BufferedOutputStream(f);
			String s ="Welcome to Coding World";
					byte b1[] = s.getBytes();
			f.write(b1);
			b.flush();
			f.close();
			b.close();
			System.out.println("Done");
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
