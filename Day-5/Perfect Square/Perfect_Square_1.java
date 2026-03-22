package prepinsta;

import java.util.Scanner;

public class Perfect_Square_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scn.nextInt();
		if(perfectSquare(n)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		scn.close();

	}
	
	static boolean perfectSquare(int num) {
		int root =(int) Math.sqrt(num);
		
		return num==root*root;
	}

}
