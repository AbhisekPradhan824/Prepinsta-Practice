package prepinsta;

import java.util.Scanner;

public class HCF_1 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1=scn.nextInt();
		
		System.out.println("Enter Second Number");
		int num2=scn.nextInt();
		
		int hcf=0;
		
		for(int i=1; i<=num1 || i<=num2; i++) {
			if(num1%i ==0 && num2%i ==0) {
				hcf=i;
			}
		}
		
		System.out.println("The HCF of "+ num1+ " and "+num2+ " is "+ hcf);
	}
}
