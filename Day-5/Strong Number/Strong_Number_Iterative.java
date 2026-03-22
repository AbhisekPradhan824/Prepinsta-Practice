package prepinsta;

import java.util.Scanner;

public class Strong_Number_Iterative {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num= scn.nextInt();
		
		int sum=0;
		 
		int n=num;
		while(n!=0) {
			sum+= getFactorial(n%10);
			n/=10;
		}
		
		if(num==sum) {
			System.out.println("The Number "+ num+ " is a Strong Number");
		}else {
			System.out.println("The Number "+ num+ " is not a Strong Number");
		}
		
		scn.close();

	}
	static int getFactorial(int num) {
		int factorial=1;
		if(num==0) {
			return factorial;
		}
		
		for(int i=num; i>=1; i--) {
			factorial*=i;
		}
		return factorial;
	}

}
