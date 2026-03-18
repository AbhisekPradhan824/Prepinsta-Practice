package prepinsta;

import java.util.Scanner;

public class GreatestofThreeNumbersUsingIfElse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number:  ");
		int num1=scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2=scn.nextInt();
		
		System.out.println("Enter Third Number: ");
		int num3=scn.nextInt();
		
		if((num1 >= num2)&&(num1 >=num3)) {
			System.out.println(num1 + " Is the Greatest Number..");
		}else if ((num2 >= num1)&&(num2 >=num3)) {
			System.out.println(num2 + " Is the Greatest Number...");
		}else {
			System.out.println(num3 + " Is the Greatest Number...");
		}
		
		scn.close();

	}

}
