package prepinsta;

import java.util.Scanner;

public class Integer_HavingX_Factors_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the highest range");
		int range = scn.nextInt();
		
		System.out.println("Enter number of factors you want");
		int factors=scn.nextInt();
		int count=0;
		
		for(int i=1; i<=range; i++) {
			if(factors==countFactors(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total "+count+ " numbers are there in the range 1 and "+range + " whose number of factors = "+factors);
		scn.close();
		
		
	}
	static int countFactors(int number) {
		int count=0;
		
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count;
	}
}
