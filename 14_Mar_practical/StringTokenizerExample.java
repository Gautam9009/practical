package march_14_23_String;

import java.util.StringTokenizer;
public class StringTokenizerExample {  // class
	public static void my() {  // my method
		StringTokenizer t = new StringTokenizer("Anudip foundation skill and career development"," ");
		while(t.hasMoreElements()) {  // boolean method it check there is more token available or not
			System.out.println(t.nextToken(" "));  // string method if return the next token from staying token
		}
		StringTokenizer st = new StringTokenizer("i am Gautam & Staying in Faridabad");
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken("&"));
		}
	}
	public static void main(String[] args) {
		my();
	}
}
