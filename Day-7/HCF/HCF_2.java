package prepinsta;

import java.util.Scanner;

public class HCF_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int n1=scn.nextInt();
		
		System.out.println("Enter the Second Number");
		int n2=scn.nextInt();
		
		System.out.println(" HCF Of "+ n1 + " and "+ n2 + " is "+ getHCF(n1, n2));
		

	}
	
	static int getHCF(int n1, int n2) {
		if(n1==0) {
			return n2;
		}
		
		if(n2==0) {
			return n1;
		}
		
		if(n1==n2) {
			return n1;
		}
		
		if(n1>n2) {
			n1-=n2;
			return getHCF(n1, n2);
		}
		
			return getHCF(n1, n2-n1);
		
	}

}
