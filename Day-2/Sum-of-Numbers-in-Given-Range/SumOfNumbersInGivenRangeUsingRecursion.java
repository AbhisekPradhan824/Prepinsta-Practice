package prepinsta;

import java.util.Scanner;

public class SumOfNumbersInGivenRangeUsingRecursion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Initial Number: ");
		int first = scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int last = scn.nextInt();
		
		int sum=findSum(0, first, last);
		
		System.out.println("Sum of results in the range " + first +" " + last+ " is "+ sum);
		scn.close();

	}
	
	public static int findSum(int sum, int first, int last) {
		if(first>last) {
			return sum;
		}else {
			return first+ findSum( sum, first+1, last);
		}
	}

}
