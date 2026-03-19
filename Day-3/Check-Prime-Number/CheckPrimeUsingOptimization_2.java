package prepinsta;

import java.util.Scanner;

public class CheckPrimeUsingOptimization_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number..");
		int num=scn.nextInt();
		
		boolean isPrime=true;
		
		if(num<2) {
			isPrime=false;
		}else {
			for (int i=2; i<Math.sqrt(num); i++) {
				if(num%i==0) {
					isPrime=false;
				}
			}
		}
		
		String result = isPrime? " a Prime Number" : " Not a Prime Number";
		
		System.out.println("The Number "+ num+ " is"+ result);

		scn.close();
	}

}
