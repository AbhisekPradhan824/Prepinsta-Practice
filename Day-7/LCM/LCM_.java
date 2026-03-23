package prepinsta;

import java.util.Scanner;

public class LCM_3 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=scn.nextInt();
		
		System.out.println("Enter the Second Number");
		int n2=scn.nextInt();
		
		int min = Math.min(n1, n2);
		int gcf=0;
		
		for (int i=1; i<=min; i++) {
			if(n1%i==0 && n2%i==0) {
				gcf=i;
			}
		}
		
		int lcm=(n1*n2)/gcf;
		System.out.println("LCM: "+lcm);
		scn.close();
	}

}
