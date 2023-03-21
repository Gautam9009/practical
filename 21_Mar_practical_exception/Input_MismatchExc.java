package march_21_23_exception;

import java.util.Scanner;

public class Input_MismatchExc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		try {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			System.out.println("result : "+ X/Y);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
