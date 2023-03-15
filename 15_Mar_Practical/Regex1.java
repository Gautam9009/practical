package assigment_15_march;

import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {
		boolean b1 = Pattern.matches("[a-zA-z]", "p");
		boolean b2 = Pattern.matches("[abc]", "s");
		boolean b3 = Pattern.matches("[^abc]", "q");
		boolean b4 = Pattern.matches("[A-Za-z0-9]{8,}", "Anudip777ppp");
		System.out.println(b1+" "+b2+" "+b3+" "+b4);
	}
}
