package prepinsta;

import java.util.Scanner;

public class Count_Occurance_of_Digit_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number =scn.nextInt();
		System.out.println("Enter the Digit: ");
		int digit =scn.nextInt();
		
		int count =0;
		int temp=number;
		
		while(temp!=0) {
			if(digit == temp%10) {
				count++;
			}
			temp/=10;
		}
		System.out.println("The Digit " + digit + " occured "+ count + " times in the number "+number);
		scn.close();
	}

}
