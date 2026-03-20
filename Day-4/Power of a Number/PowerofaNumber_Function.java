package prepinsta;

import java.util.Scanner;

public class PowerofaNumber_Function {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter the Base \t : ");
		double n=scn.nextDouble();
		
		System.out.print("\nEnter the Power \t : ");
		double p=scn.nextDouble();
		
		System.out.println("\n"+ p +" Power of the number "+n+" is "+ Math.pow(n, p));
		scn.close();

	}

}
