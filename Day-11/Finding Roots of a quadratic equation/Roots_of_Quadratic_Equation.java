package prepinsta;

import java.util.Scanner;

public class Roots_of_Quadratic_Equation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a =scn.nextInt();
		System.out.println("Enter the value of b ");
		int b= scn.nextInt();
		System.out.println("Enter the value of c ");
		int c= scn.nextInt();
		scn.close();
		
		findRoots(a, b, c);
		
	}
	static void findRoots(int a, int b, int c) {
		if(a==0) {
			System.out.println("Invalid!");
			return;
		}
		int d= b*b - 4*a*c;
		double sqrt_val = Math.sqrt(Math.abs(d));
		
		if(d>0) {
			System.out.println("Roots are real and different");
			System.out.println((-(double)b +d)/(2*a) + "\n" + (-(double)b - d)/(2*a));
		}else if(d==0) {
			System.out.println("Roots are Real and Equal");
			System.out.println((-(double)b)/(2*a) + "\n" + (-(double)b)/(2*a) );
		}else {
			System.out.println("Roots are Complex");
			System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
		}
	}
}
