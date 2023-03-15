package assigment_15_march;
import java.util.regex.Pattern;
public class regex3 {
	
		public static void main(String[] args) {
			boolean b1 = Pattern.matches("[A-Za-z0-9+.+@]{12,}", "Pallabi.Anudip@2023");
			System.out.println(b1);
			
			boolean b2 = Pattern.matches("[0-9]{10}", "8766240472");
			System.out.println(b2);
			
			boolean b3 = Pattern.matches("[6789]{1}[0-9]{9}", "8766240472");
			System.out.println(b3);
	
		}
}
