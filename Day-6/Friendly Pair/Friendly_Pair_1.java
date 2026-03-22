package prepinsta;

import java.util.Scanner;

public class Friendly_Pair_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the First Number of the Pair: ");
		int number1=scn.nextInt();
		
		System.out.print("\nEnter the Second Number of the Pair: ");
		int number2=scn.nextInt();
		
		System.out.println();
		
		int sumFactor1=sumOfFactors(number1);
		int sumFactor2=sumOfFactors(number2);
		
		double number1Ratio = number1/sumFactor1;
		double number2Ratio = number2/sumFactor2;
		
		if(number1Ratio==number2Ratio) {
			System.out.println("Yes!, The Number "+ number1 + " & "+ number2 + " are the Friendly Pair");
		}else {
			System.out.println("No!, The Number "+ number1 + " & "+ number2 + " are not the Friendly Pair");
		}
		
		scn.close();
		
	}
	
	
	// Method for finding sum of factors of numbers using for loop
	static int sumOfFactors(int num) {
		
		int sumFactor=0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sumFactor+=i;
			}
		}
		return sumFactor;
	}
	
	
}
