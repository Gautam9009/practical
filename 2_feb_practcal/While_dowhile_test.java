package ControlStatement;
  // way 1
import java.util.Scanner;
//find out the sum of positive number
public class While_dowhile_test {
public static void main(String[] args) {
	
	int sum = 0;
	int number = 0;
	
	// scanner class
	Scanner sc = new Scanner(System.in); // 
	System.out.println("Enter the numbers");
	
	while(true) {
		number = sc.nextInt();
			if(number<0)break;	
		sum+=number;
		
	}
	System.out.println("sum is:"+sum);
	sc.close();
}
}
