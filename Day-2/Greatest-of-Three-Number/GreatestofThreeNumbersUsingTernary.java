package prepinsta;

import java.util.Scanner;

public class GreatestofThreeNumbersUsingTernary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int temp, result;
		
		System.out.println("Enter First Number:  ");
		int num1=scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2=scn.nextInt();
		
		System.out.println("Enter Third Number: ");
		int num3=scn.nextInt();
		
		temp = num1>=num2 ? num1:num2;
		result= temp>=num3 ? temp: num3;
		
		System.out.println(result + " Is the Greatest Number...");
		
		scn.close();

	}

}
