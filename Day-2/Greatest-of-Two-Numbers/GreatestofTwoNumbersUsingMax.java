package prepinsta;

import java.util.Scanner;

public class GreatestofTwoNumbersUsingMax {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number:  ");
		int num1=scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2=scn.nextInt();
		
		int greatestNum= Math.max(num1, num2);
		
		System.out.println(greatestNum + " Is the Greatest Number..");
		
		scn.close();

	}

}
