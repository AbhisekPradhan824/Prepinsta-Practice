package prepinsta;

import java.util.Scanner;

public class PrimeNumbersInRange_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int first= scn.nextInt();
		
		System.out.println("Enter Last Number");
		int last = scn.nextInt();
		
		for(int i=first; i<=last; i++ ) {
			if(isPrime(i)) {
				System.out.print(i+ "\t");
			}
		}
		System.out.println();
		
		scn.close();
		

	}
	static boolean isPrime(int num) {
		 if(num<2) {
			 return false;
		 }
		 if(num%2==0) {
			 return false;
		 }
		 for(int i=3; i<Math.sqrt(num); i+=2) {
			 if(num%i==0) {
				 return false;
			 }
		 }
		 return true;
	}

}
