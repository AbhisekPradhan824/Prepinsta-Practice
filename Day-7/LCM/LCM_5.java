package prepinsta;

import java.util.Scanner;

public class LCM_5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=scn.nextInt();
		
		System.out.println("Enter the Second Number");
		int n2=scn.nextInt();
		
		
		int lcm=n1*n2 / getGcf(n1, n2);
		System.out.println("LCM: "+lcm);
		scn.close();

	}
static int getGcf(int n1, int n2) {
		
		if(n1==n2) {
			return n1;
		}
		if(n1==0) {
			return n2;
		}
		if(n2==0) {
			return n1;
		}
		
		if(n1>n2) {
			return getGcf(n1-n2, n2);
		}
		
		return getGcf(n1, n2-n1);
		
		
	}

}
