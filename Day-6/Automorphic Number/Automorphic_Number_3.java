package prepinsta;

import java.util.Scanner;

public class Automorphic_Number_3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		if(isAutomorphic(num)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		scn.close();
		
	}
	static boolean isAutomorphic(int num) {
		int square=num*num;
		
		while(num!=0) {
			if(num%10 != square%10) {
				return false;
			}
			num/=10;
			square/=10;
		}
		return true;
	}
}
