package ControlStatement;

	import java.util.Scanner;
	//find out the sum of positive number
	public class While_dowhile_test1 {
	public static void main(String[] args) {
		
		int sum = 0;
		int number = 0;
		
		// scanner class
		Scanner sc = new Scanner(System.in); // 
		System.out.println("Enter the numbers");
		
		int number1 = sc.nextInt();
		while(number>=0) {
			sum+=number;
			System.out.println("Enter the numbers");
			number = sc.nextInt();
		}
		System.out.println("sum is:"+sum);
		sc.close();
	}
	}

