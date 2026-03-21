package prepinsta;

import java.util.Scanner;

public class PrimeFactor_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		
		System.out.println("The Prime Factors of the number "+ num + " Is : ");
		PFactor(num);
		scn.close();
		
		

	}
	
	static void PFactor(int num) {
		for(int i=2; i<num; i++) {
			if(isPrime(i)) {
				int n =num;
				while(n%i==0) {
					System.out.print(i+" ");
					n/=i;
				}
				
			}
		}
	}
	
	static boolean isPrime(int num) {
		
		if(num==2) {
			return true;
		}
		if(num<2) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
