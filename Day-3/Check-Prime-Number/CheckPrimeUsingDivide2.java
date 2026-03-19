package prepinsta;

import java.util.Scanner;

public class CheckPrimeUsingDivide2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number..");
		int num=scn.nextInt();
		
		boolean isPrime=true;
		
		if(num<2) {
			isPrime=false;
		}
		else if(num%2==0) {
			isPrime=false;
		}
			else {
			for (int i=3; i<Math.sqrt(num); i+=2) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		String result = isPrime? " a Prime Number" : " Not a Prime Number";
		
		System.out.println("The Number "+ num+ " is"+ result);

		scn.close();
	}

}
