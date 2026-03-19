package prepinsta;

import java.util.Scanner;

public class ReversedNumberFor {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int number= scn.nextInt();
		
		int reversedNumber= getReversedNumber(number);
		System.out.println("Reversed Number of the number "+ number + " is "+ reversedNumber);
		scn.close();

	}
	static int getReversedNumber(int num) {
		int reversed=0;
		
		if (num==0) {
			return num;
		}
		for(; num!=0; num/=10) {
			reversed=reversed*10 + num%10;
		}
		return reversed;
	}

}
