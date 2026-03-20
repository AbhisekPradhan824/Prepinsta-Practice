package prepinsta;

import java.util.Scanner;

public class FactorialNumberRecursion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		int factorial=getFactorial(num);
		
		System.out.println("Factorial of the number "+ num + " is "+ factorial);
		scn.close();

	}
	static int getFactorial(int num) {
		if(num<1) {
			return 1;
		}
		return num*getFactorial(num-1);
	}

}
