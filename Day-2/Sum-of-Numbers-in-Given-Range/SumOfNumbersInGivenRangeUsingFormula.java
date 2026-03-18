package prepinsta;

import java.util.Scanner;

public class SumOfNumbersInGivenRangeUsingFormula {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Initial Number: ");
		int first = scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int second = scn.nextInt();
		
		int sum=second*(second+1)/2 - first*(first+1)/2 + first;
		
		System.out.println("Sum of results in the range " + first +" " + second+ " is "+ sum);
		scn.close();

	}

}
