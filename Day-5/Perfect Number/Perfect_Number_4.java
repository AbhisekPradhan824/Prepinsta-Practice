package prepinsta;

import java.util.Scanner;

public class Perfect_Number_4 {
	
	static int sum=0;
	
	static boolean isPerfect(int i, int num) {
		
		if(i<=num/2) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
			isPerfect(i, num);
		}
		
		return num==sum;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		
		if(isPerfect(1, num)) {
			System.out.println("The number "+ num + " is a Perfect Number");
		}else {
			System.out.println("The number "+ num + " is not a Perfect Number");
		}
		
		scn.close();
	}

}
