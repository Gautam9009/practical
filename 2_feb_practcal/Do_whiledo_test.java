package ControlStatement;

import java.util.Scanner;
//find out the sum of positive number
public class Do_whiledo_test {
public static void main(String[] args) {
	
	int sum = 0;
	int number = 0;
	
	// scanner class
	Scanner sc = new Scanner(System.in); // 
	do {
		sum+=number;
		System.out.println("Enter the numbers");
		number = sc.nextInt();
	} while(number>=0);
	System.out.println("sum is:"+sum);
	sc.close();
}
}