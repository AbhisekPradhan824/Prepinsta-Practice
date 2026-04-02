package prepinsta;

import java.util.Scanner;

public class Power_Number_Recursion_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Base: ");
		int base = scn.nextInt();
		
		System.out.println("Enter power: ");
		int power = scn.nextInt();
		
		int result = getPower(base, power);
		System.out.println(power+" power of the number "+base+" is "+ result);
		scn.close();
	}

	static int getPower(int base, int x) {
		int result=1;
		if(x==0) {
			return 1;
		}
		while(x>0) {
			result*=base;
			x--;
		}
		return result;
	}
}
