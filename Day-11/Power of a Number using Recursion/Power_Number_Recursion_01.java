package prepinsta;

import java.util.Scanner;

public class Power_Number_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int num = scn.nextInt();
		
		System.out.println("Enter Power ");
		int power = scn.nextInt();
		
		int res = getPower(num, power);
		System.out.println(power+" power of the number "+num+" is "+ res);
		scn.close();
		
	}
	
	static int getPower(int num , int power) {
		if(power==0) {
			return 1;
		}
		return num* getPower(num, power-1);
	}
}
