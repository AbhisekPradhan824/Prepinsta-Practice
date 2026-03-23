package prepinsta;

import java.util.Scanner;

public class LCM_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1=scn.nextInt();
		
		System.out.println("Enter Second Number");
		int num2=scn.nextInt();
		
		int lcm=getLCM(num1, num2);
		
		System.out.println("LCM : "+ lcm);
		scn.close();
		
		
	}
	static int getLCM(int num1, int num2) {
		
		int max=Math.max(num1, num2);
		int lcm=0;
		
		if(num1==num2) {
			return num1;
		}
		if(num2%num1==0) {
			return num2;
		}
		for(int i=max; i<=num1*num2; i+=max) {
			if(i%num1==0 && i%num2==0) {
				lcm=i;
			}
		}
		return lcm;
	}
}
