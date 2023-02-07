package methods;
import java.util.Scanner;
public class method1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int num=sc.nextInt();
	
	findevenodd(num);
}
public static void findevenodd(int num) {
	if(num%2==0) {
		System.out.println(num+" Even");
	}
	else {
		System.out.println(num+" odd");
	}
}
}
