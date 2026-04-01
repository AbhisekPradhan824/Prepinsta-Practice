package prepinsta;

import java.util.Scanner;

public class Number_of_Digits_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int number =scn.nextInt();
		int digit=0;
		
		while(number!=0) {
			digit++;
			number/=10;
		}
		System.out.println(digit);
	}

}
