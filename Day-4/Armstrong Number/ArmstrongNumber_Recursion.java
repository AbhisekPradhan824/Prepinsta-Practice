package prepinsta;

import java.util.Scanner;

public class ArmstrongNumber_Recursion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int number=scn.nextInt();
		
		int size=getSize(number);
		
		if(getArmstrong(number, size)==number) {
			System.out.println("It is an Armstrong Number");
		}else {
			System.out.println("It is not an Armstrong Number");
		}
		scn.close();
		
	}
	
	
	
	
	static int getSize(int n) {
		int size=0;
		while(n!=0){
			size++;
			n/=10;
		}
		return size;
	}
	
	
	
	static int getArmstrong(int n, int s) {
		if(n==0) {
			return 0;
		}
		
		return (int)Math.pow(n%10, s) + getArmstrong(n/10, s);
		
	}
}
