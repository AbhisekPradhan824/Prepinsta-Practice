package prepinsta;

import java.util.Scanner;

public class LCM_6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=scn.nextInt();
		
		System.out.println("Enter the Second Number");
		int n2=scn.nextInt();
		
		int min=Math.min(n1, n2);
		int max=Math.max(n1, n2);
		
		int lcm=n1*n2 / getGcf(min, max);
		System.out.println("LCM: "+lcm);
		scn.close();

	}
static int getGcf(int n1, int n2) {
		
		return n2==0 ? n1: getGcf(n2, n2%n1);
		
		
	}

}
