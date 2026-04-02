package prepinsta;

import java.util.Scanner;

public class Count_Occurance_of_Digit_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scn.nextInt();
		System.out.println("Enter the digit");
		int digit = scn.nextInt();
		String numStr = Integer.toString(number);
		char digitChar = Character.forDigit(digit, 10);
		int count=0;
		
		for(int i=0; i<numStr.length(); i++) {
			if(numStr.charAt(i)==digitChar) {
				count++;
			}
		}
		System.out.println("The Digit " + digit + " occured "+ count + " times in the number "+number);
		scn.close();
	}
	
}
