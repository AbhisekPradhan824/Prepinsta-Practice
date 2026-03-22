package prepinsta;

import java.util.Scanner;

public class Strong_Number_Recursive {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=scn.nextInt();
		
		if(isStrong(num)) {
			System.out.println(" The Number "+ num+ " is a Strong Number..");
		}else {
			System.out.println(" The Number "+ num+ " is not a Strong Number..");
		}
		scn.close();

	}
	
	static int getFactorial(int num) {
		
		if(num==0) {
			return 1;
		}
		
		return num*getFactorial(num-1);
	}
	
	static boolean isStrong(int num) {
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			sum+=getFactorial(temp%10);
			temp/=10;
		}
		
		return sum==num;
		
	}

}
