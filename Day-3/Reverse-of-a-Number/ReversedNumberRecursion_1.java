package prepinsta;

import java.util.Scanner;

public class ReversedNumberRecursion_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int number= scn.nextInt();
		
		int reversedNumber= getReversedNumber(number,0);
		System.out.println("Reversed Number of the number "+ number + " is "+ reversedNumber);
		scn.close();

	}
	static int getReversedNumber(int num, int reversed) {
		
		if (num==0) {
			return reversed;
		}
		
		int rem= num%10;
		reversed= reversed*10 + rem;
		return getReversedNumber(num/10, reversed);
	}

}
