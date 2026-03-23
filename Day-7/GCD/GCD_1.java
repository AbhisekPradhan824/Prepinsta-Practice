package prepinsta;

import java.util.Scanner;

public class GCD_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1=scn.nextInt();
		System.out.println("Enter Second Number");
		int n2=scn.nextInt();
		scn.close();
		int i;
		
		int min=Math.min(n1, n2);
		
		for(i=min; i>=1; i--) {
			if(n1%i == 0 && n2%i == 0) {
				
				break;
			}
		}
		
		System.out.println("GCD of "+ n1 + " and "+ n2 + " is "+ i);

	}

}
