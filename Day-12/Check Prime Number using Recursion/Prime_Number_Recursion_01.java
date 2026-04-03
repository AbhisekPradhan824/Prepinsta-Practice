package prepinsta;

import java.util.Scanner;

public class Prime_Number_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int num = scn.nextInt();
		
		if(isPrime(num,2)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		scn.close();
	}
	
	static boolean isPrime(int num, int x) {
		if(num <=2) {
			return false;
		}
		if(num%x==0) {
			return false;
		}
		 if(x*x >num) {
			 return true;
		 }
		 return isPrime(num, x+1);
	}

}
