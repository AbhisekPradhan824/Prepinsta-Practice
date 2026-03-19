package prepinsta;

import java.util.Scanner;

public class PrimeNumbersInRange_2 {

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
		 for(int i=2; i<num/2; i++) {
			 if(num%i==0) {
				 return false;
			 }
		 }
		 return true;
	}

}
