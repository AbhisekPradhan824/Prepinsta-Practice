package prepinsta;

import java.util.Scanner;

public class Perfect_Square_2 {

	static boolean isPerfectSq(int num) {
		double root = Math.sqrt(num);
		return Math.floor(root)==Math.ceil(root);
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		
		if(isPerfectSq(num)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		scn.close();
	}
}
