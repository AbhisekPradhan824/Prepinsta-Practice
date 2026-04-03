package prepinsta;

import java.util.Scanner;

public class Prime_Number_Recursion_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num =scn.nextInt();
		scn.close();
		
		if(isPrime(num)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}
	
	static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		if(num==2) {
			return true;
		}
		if(num%2==0) {
			return false;
		}
		for(int i=3; i<num; i+=2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
