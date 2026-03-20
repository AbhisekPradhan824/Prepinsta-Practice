package prepinsta;

import java.util.Scanner;

public class FactorialOfNumberIteration {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=scn.nextInt();
		
		int factorial=1;
		
		for(int i=number; i>0; i--) {
			factorial*=i;
		}
		System.out.println("Factorial of the number is :"+ factorial);
		scn.close();

	}

}
