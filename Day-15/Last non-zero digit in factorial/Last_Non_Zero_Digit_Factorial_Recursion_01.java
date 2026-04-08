package prepinsta;

import java.util.Scanner;

public class Last_Non_Zero_Digit_Factorial_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num =scn.nextInt();
		
		int fact = getFactorial(num);
		
		
		while(fact%10==0) {
			fact/=10;
		}
		System.out.println(fact);
		scn.close();
	}
	
	static int getFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n* getFactorial(n-1);
	}
}
