package ControlStatement;

import java.util.Scanner;

public class Multiplication_table {
public static void main(String[] args) {
	
	int mul;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int number=sc.nextInt();
	
	for(int i=1 ; i<=10; i++); 
	{
		mul=number*1 ; 
			System.out.println(mul);
		}
		sc.close();
	}
	
	
}
