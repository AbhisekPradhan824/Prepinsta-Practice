package prepinsta;

import java.util.Scanner;

public class HCF_Recursion_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 =scn.nextInt();
		System.out.println("Enter second Number");
		int num2 = scn.nextInt();
		
		int hcf =getHcf(num1, num2);
		System.out.println("HCF is : "+hcf);
		scn.close();
	}
	public static int getHcf(int num1, int num2) {
		return (num2==0)?num1: getHcf(num2, num1%num2); 
	}

}
