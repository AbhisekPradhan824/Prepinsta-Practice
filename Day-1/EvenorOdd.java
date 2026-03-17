package prepinsta;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number...");
		int number= scn.nextInt();
		
		String message= (number % 2==0)? "Number is Even":"Number is Odd";
		
		System.out.println(message);
	}
}
