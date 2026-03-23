package prepinsta;

import java.util.Scanner;

public class GCD_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter first num");
		int n1=scn.nextInt();
		
		System.out.println("Enter second num");
		int n2=scn.nextInt();
		
		System.out.println("GCD: "+ getGCD(n1, n2));

	}

	static int getGCD(int n1, int n2) {
		if(n2==0) {
			return n1;
		}
		return getGCD(n2, n1%n2);
	}
}
