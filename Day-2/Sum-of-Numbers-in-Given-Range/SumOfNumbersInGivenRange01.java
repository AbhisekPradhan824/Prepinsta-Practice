package prepinsta;

import java.util.Scanner;

public class SumOfNumbersInGivenRange01 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Initial Number: ");
		int first = scn.nextInt();
		
		System.out.println("Enter Second Number: ");
		int second = scn.nextInt();
		
		int sum=0;
		
		for(int i=first; i<=second; i++) {
			sum+=i;
		}
		
		System.out.println("Sum of results in the range " + first +" " + second+ " is "+ sum);
		scn.close();

	}

}
