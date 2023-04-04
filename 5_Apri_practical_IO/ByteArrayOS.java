package april_5_23_IO;

import java.io.ByteArrayOutputStream;

class ByteArrayOS {
	public static void main(String[] args) {
	// 	D:\\sample.txt  D:\\sample1.txt
		FileOutputStream f1 = new FileOutputStream("D:\\sample.txt");
		FileOutputStream f2 = new FileOutputStream("D:\\sample1.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(f1);
		bout.writeTo(f2);
		bout.flush();
		bout.close();
		System.out.println("Done");		
	}
}
