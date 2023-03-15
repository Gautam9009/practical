package assigment_15_march;

import java.util.regex.*;
public class regex2 {
	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile("..s");
		Matcher m = p.matcher("khs");
		boolean b = m.matches();
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("kjs").matches();
		
		// 3rd way
	boolean b3 = Pattern.matches("..s", "ks");
	System.out.println(b+" "+b2+" "+b3);
	
	}
}
