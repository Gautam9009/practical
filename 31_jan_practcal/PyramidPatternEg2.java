package ControlStatement;

public class PyramidPatternEg2 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {  //  outer loop for row number
		
		for (int j = 5; j >= i; j--) {  //Inner loop forprint space before star (+)
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {  // Inner loop for print star (*)
			System.out.print("* ");
		}
		System.out.println();  // new line
	}
}
}
