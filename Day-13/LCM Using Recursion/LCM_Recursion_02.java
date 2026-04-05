package prepinsta;

import java.util.Scanner;

public class LCM_Recursion_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 =scn.nextInt();
		System.out.println("Enter second Number");
		int num2 = scn.nextInt();
		
		int hcf =getHcf(num1, num2);
		System.out.println("HCF is : "+hcf);
		int lcm = (int) num1*num2/hcf;
		System.out.println("LCM is : "+lcm);
		scn.close();
	}
	public static int getHcf(int num1, int num2) {
		if(num1==0) {
			return num2;
		}
		if(num2==0) {
			return num1;
		}
		if(num1==num2) {
			return num1;
		}
		if(num1> num2) {
			return getHcf(num1-num2, num2);
		}else {
			return getHcf(num2, num2-num1);
		}
	}

}
