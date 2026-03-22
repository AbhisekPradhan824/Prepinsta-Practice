package prepinsta;

import java.util.Scanner;

public class Perfect_Number_5 {

	static int getPerfect(int num) {
		int sum=0;
		
		for(int i=1; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				if(i==1) {
					sum=sum+1;
				}else if(i==num/i) {
					sum=sum+i;
				}else {
					sum=sum+i+num/i;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		
		if(num==getPerfect(num)) {
			System.out.println("The number "+ num + " is a Perfect Number");
		}else {
			System.out.println("The number "+ num + " is not a Perfect Number");
		}
		scn.close();
	}
	
}
